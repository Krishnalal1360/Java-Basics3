import java.util.Scanner;

public class IndirectRecursion{

  public String even(int n){
    if(n == 0){
      return "Even";
    }
    return odd(n-1);
  }

  public String odd(int n){
    if(n == 0){
      return "Odd";
    }
    return even(n-1);
  }

  public static void main(String[] args){
    int n=0;
    String flag="";
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    IndirectRecursion ob1 = new IndirectRecursion();
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    flag = ob1.even(n);
    System.out.println("Number "+n+" is "+flag);

    System.out.println("Enter a number: ");
    n = sc.nextInt();
    flag = ob1.even(n);
    System.out.println("Number "+n+" is "+flag);

    System.out.println("\nFor Object 2: ");
    IndirectRecursion ob2 = new IndirectRecursion();
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    flag = ob2.even(n);
    System.out.println("Number "+n+" is "+flag);

    System.out.println("Enter a number: ");
    n = sc.nextInt();
    flag = ob2.even(n);
    System.out.println("Number "+n+" is "+flag);    
    sc.close();
  }
}