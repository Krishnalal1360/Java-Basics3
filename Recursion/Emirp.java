import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;
import java.lang.Integer;

public class Emirp{

  public int n, rev;

  Emirp(){
    this.n = 0;
    this.rev = 0;
  }

  Emirp(int nn){
    this.n = nn;
  }

  public int isPrime(int n){
    if(n < 2){
      return 1;
    }else{
      for(int i=2;i<=n/2;i++){
        if(n%i == 0){
          return 1;
        }else{
          continue;
        }
      }
      return 0;
    }
  }

  public int reverse(int n){
    String st = String.valueOf(n);
    StringBuffer sb = new StringBuffer(st);
    st = sb.reverse().toString();
    int m = Integer.parseInt(st);
    return m;
  }

  public void isEmirp(){
    int f1=0, f2=0;
    this.rev = reverse(this.n);
    f1 = isPrime(this.n);
    f2 = isPrime(this.rev);
    if(f1 == 0 && f2 == 0){
      System.out.println("Number "+this.n+" is Emirp!");
    }else{
      System.out.println("Number "+this.n+" is not Emirp!");
    }
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    Emirp ob1 = new Emirp(n);
    ob1.isEmirp();

    System.out.println("\nFor Object 2: ");
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    Emirp ob2 = new Emirp(n);
    ob2.isEmirp();
    sc.close();
  }
}