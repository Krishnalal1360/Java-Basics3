import java.util.Scanner;

public class Reverse{

  public int n, r, s;

  Reverse(int n){
    this.n = n;
    this.r = 0;
    this.s = 0;
  }

  public int rev(int n){
    if(n == 0){
      return s;
    }else{
      r = n%10;
      s = s*10+r;
      n = n/10;
      return rev(n);
    }
  }

  public static void main(String[] args){
    int n=0, rev=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    Reverse ob1 = new Reverse(n);
    rev = ob1.rev(n);
    System.out.println("Reverse of "+n+" is "+rev);

    System.out.println("\nFor Object 2: ");
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    Reverse ob2 = new Reverse(n);
    rev = ob2.rev(n);
    System.out.println("Reverse of "+n+" is "+rev);
    sc.close();
  }
}