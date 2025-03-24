import java.util.Scanner;

public class RecFact{

  public int n, r, s;

  RecFact(){
    this.n = 0;
    this.r = 0;
    this.s = 0;
  }

  public void readnum(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value for n: ");
    this.n = sc.nextInt();
    System.out.println("Enter the value for r: ");
    this.r = sc.nextInt();
  }

  public void factseries(){
    this.s = (factorial(this.n))/(factorial(this.r)*factorial(this.n-this.r));
    System.out.println("The value of nCr is: "+this.s);
  }

  public int factorial(int n){
    if(n == 1){
      return 1;
    }else{
      return n*factorial(n-1);
    }
  }

  public static void main(String[] args) {
    System.out.println("\nFor Object 1: ");
    RecFact ob1 = new RecFact();
    ob1.readnum();
    ob1.factseries();
  }
}