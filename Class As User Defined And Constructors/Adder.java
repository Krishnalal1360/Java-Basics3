import java.util.Scanner;

public class Adder{

  public int ar[];

  Adder(){
    this.ar = new int[2];
  }

  public void readTime(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter hours: ");
    ar[0] = sc.nextInt();
    if((ar[0] < 1) || (ar[0] > 12)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    System.out.println("\nEnter minutes: ");
    ar[1] = sc.nextInt();
    if((ar[1] < 1) || (ar[1] > 60)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
  }

  public void addTime(Adder ob1, Adder ob2){
    this.ar[0] = ob1.ar[0] + ob2.ar[0];
    this.ar[1] = ob1.ar[1] + ob2.ar[1];
    if(this.ar[1] >= 60){
      this.ar[0] = this.ar[0]+(this.ar[1]/60);
      this.ar[1] = this.ar[1]%60;
    }
  }

  public void dispTime(){
    System.out.println("\nHours: "+this.ar[0]);
    System.out.println("\nMinutes: "+this.ar[1]);
  }


  public static void main(String[] args){
    System.out.println("\nNote: The hours value must be in the range (1-12).");
    System.out.println("The minutes value must be in the range (1-60).");

    System.out.println("\nFor Object 1: ");
    Adder ob1 = new Adder();
    ob1.readTime();

    System.out.println("\nFor Object 2: ");
    Adder ob2 = new Adder();
    ob2.readTime();

    System.out.println("\nFor Object 3: ");
    Adder ob3 = new Adder();
    ob3.addTime(ob1, ob2);
    ob3.dispTime();
  }
}