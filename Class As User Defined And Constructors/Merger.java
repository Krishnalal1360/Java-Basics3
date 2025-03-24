import java.util.Scanner;
import java.lang.String;
import java.lang.Long;

public class Merger{

  public long n1, n2, mergNum;

  Merger(){
    this.n1 = 0l;
    this.n2 = 0l;
  }

  public void readNum(int n1, int n2){
    if((n1 <= 0) || (n2 <= 0)){
      System.out.println("Invalid Input!");
      System.exit(0);
    }
    this.n1 = n1;
    this.n2 = n2;
  }

  public void joinNum(){
    String st1="", st2="", st3="";
    st1 = Long.toString(n1);
    st2 = String.valueOf(n2);
    st3 = st1.concat(st2);
    this.mergNum = Long.parseLong(st3);
    //this.mergNum = Long.valueOf(st3);
  }

  public void show(){
    System.out.println("\nFirst Number: " + n1);
    System.out.println("Second Number: " + n2);
    System.out.println("Merged Number: " + mergNum);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: Both numbers must be greater than 0.");
    System.out.println("\nFor Object 1: ");
    System.out.println("\nEnter first number: ");
    int n1 = sc.nextInt();
    System.out.println("Enter second number: ");
    int n2 = sc.nextInt();
    Merger ob1 = new Merger();
    ob1.readNum(n1, n2);
    ob1.joinNum();
    ob1.show();
    sc.close();
  }
}