import java.util.Scanner;

public class DirectRecursion_BinaryRecursion{

  public int Gcd(int n, int m){
    if(n == m){
      return n;
    }else{
      if(n > m){
        return Gcd(n-m, m);
      }else{
        return Gcd(n, m-n);
      }
    }
  }

  public static void main(String args[]){
    int n=0, m=0, gcd=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    DirectRecursion_BinaryRecursion ob1 = new DirectRecursion_BinaryRecursion();
    System.out.println("Enter the first number: ");
    n = sc.nextInt();
    System.out.println("Enter the second number: ");
    m = sc.nextInt();
    gcd = ob1.Gcd(n, m);
    System.out.println("GCD of "+n+" and "+m+" is "+gcd);

    System.out.println("\nFor Object 2: ");
    DirectRecursion_BinaryRecursion ob2 = new DirectRecursion_BinaryRecursion();
    System.out.println("Enter the first number: ");
    n = sc.nextInt();
    System.out.println("Enter the second number: ");
    m = sc.nextInt();
    gcd = ob2.Gcd(n, m);
    System.out.println("GCD of "+n+" and "+m+" is "+gcd);
    sc.close();
  }
}