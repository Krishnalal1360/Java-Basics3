import java.util.Scanner;

public class DirectRecursion_TailRecursion{

  public int Fact(int n){
    if(n == 0){
      return 1;
    }
    return n*Fact(n-1);
  }


  public static void main(String[] args){
    int n=0, fact=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    DirectRecursion_TailRecursion ob1 = new DirectRecursion_TailRecursion();
    System.out.println("Enter number of terms: ");
    n = sc.nextInt();
    fact = ob1.Fact(n);
    System.out.println("Factorial of "+n+" is "+fact);

    System.out.println("\nFor Object 2: ");
    DirectRecursion_TailRecursion ob2 = new DirectRecursion_TailRecursion();
    System.out.println("Enter number of terms: ");
    n = sc.nextInt();
    fact = ob2.Fact(n);
    System.out.println("Factorial of "+n+" is "+fact);

    System.out.println("\nFor Object 3: ");
    DirectRecursion_TailRecursion ob3 = new DirectRecursion_TailRecursion();
    System.out.println("Enter number of terms: ");
    n = sc.nextInt();
    fact = ob3.Fact(n);
    System.out.println("Factorial of "+n+" is "+fact);
    sc.close();
  }
}