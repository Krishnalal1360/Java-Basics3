import java.util.Scanner;

public class Factorial{

  public int n;

  Factorial(int n){
    this.n = n;
  }

  public long fact(int n){
    if(n == 1){
      return 1;
    }else{
      return n*fact(n-1);
    }
  }

  public static void main(String[] args){
    int n=0;
    long f=0l;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter number of terms: ");
    n = sc.nextInt();
    Factorial ob1 = new Factorial(n);
    f = ob1.fact(n);
    System.out.println("Factorial of "+n+" is "+f);

    System.out.println("\nFor Object 2: ");
    System.out.println("Enter number of terms: ");
    n = sc.nextInt();
    Factorial ob2 = new Factorial(n);
    f = ob2.fact(n);
    System.out.println("Factorial of "+n+" is "+f);

    System.out.println("\nFor Object 3: ");
    System.out.println("Enter number of terms: ");
    n = sc.nextInt();
    Factorial ob3 = new Factorial(n);
    f = ob3.fact(n);
    System.out.println("Factorial of "+n+" is "+f);
    sc.close();
  }
}