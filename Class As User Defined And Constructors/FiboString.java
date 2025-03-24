import java.util.Scanner;

public class FiboString{

  public String x, y, z;
  public int n;

  FiboString(){
    this.x = "";
    this.y = "";
    this.z = "";
    this.n = 0;
  }

  public void accept(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the first sequence as string: ");
    this.x = sc.next();
    System.out.println("\nEnter the second sequence as string: ");
    this.y = sc.next();
    System.out.println("\nEnter the number of terms: ");
    this.n = sc.nextInt();
  }

  public void generate(){
    System.out.println("\nFiboString sequence: ");
    if(this.n == 1){
      System.out.println(this.x);
    }else if(this.n == 2){
      System.out.println(this.x+"\t"+this.y);
    }else{
      System.out.print(this.x+"\t"+this.y);
      for(int i=3;i<=this.n;i++){
        this.z = this.y+this.x;
        System.out.print("\t"+this.z);
        this.x = this.y;
        this.y = this.z;
      }
    }
    System.out.println();
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1:");
    FiboString ob1 = new FiboString();
    ob1.accept();
    ob1.generate();

    System.out.println("\nFor Object 2:");
    FiboString ob2 = new FiboString();
    ob2.accept();
    ob2.generate();

    System.out.println("\nFor Object 3:");
    FiboString ob3 = new FiboString();
    ob3.accept();
    ob3.generate();
  }
}
