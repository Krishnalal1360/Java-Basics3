import java.util.Scanner;

public class Fibonacii{

  public int Fibo(int n){
    if(n == 1){
      return 0;
    }else if(n == 2){
      return 1;
    }else{
      return Fibo(n-1)+Fibo(n-2);
    }
  }

  public static void main(String[] args){
    int n=0, fb=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter number of terms: ");
    n = sc.nextInt();
    Fibonacii ob1 = new Fibonacii();
    fb = ob1.Fibo(n);
    System.out.println("Fibonacci of "+n+" term is "+fb);

    System.out.println("\nFor Object 2: ");
    System.out.println("Enter number of terms: ");
    n = sc.nextInt();
    Fibonacii ob2 = new Fibonacii();
    fb = ob2.Fibo(n);
    System.out.println("Fibonacci of "+n+" term is "+fb);
    sc.close();
  }
}
