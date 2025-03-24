import java.util.Scanner;

public class Tellcall {

  public String phno, name;
  public int n;
  public float amt;

  Tellcall(String phno, String name, int n){
    this.phno = phno;
    this.name = name;
    this.n = n;
  }

  public void compute(){
    if((n >= 1) && (n <= 100)){
      amt = 500.0f;
    }else if((n >= 101) && (n <= 200)){
      amt = 500.0f+(n-100)*1.0f;
    }else if((n >= 201) && (n <= 300)){
      amt = 500.0f+100*1.0f+(n-200)*1.20f;
    }else{
      amt = 500.0f+100*1.0f+100*1.20f+(n-300)*1.50f;
    }
  }

  public void display(){
    System.out.println("\nName: "+name);
    System.out.println("Phone number: "+phno);
    System.out.println("Number of calls made: "+n);
    System.out.println("Amount to be paid: Rs."+amt);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Consumer 1: ");
    System.out.println("Enter phone number: ");
    String phno = sc.next();
    System.out.println("Enter name: ");
    sc.nextLine();
    String name = sc.nextLine();
    System.out.println("Enter number of calls: ");
    int n = sc.nextInt();
    Tellcall ob1 = new Tellcall(phno, name, n);
    ob1.compute();
    ob1.display();
    sc.close();
  }
}