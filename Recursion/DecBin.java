import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;
import java.lang.Integer;

public class DecBin{

  public int n, r;
  public String st;

  DecBin(int n){
    this.n = 0;
    this.r = 0;
    this.st = "";
  }

  public String bin(int n){
    if(n == 0){
      return st;
    }else{
      r = n%2;
      st = st.concat(Integer.toString(r));
      n = n/2;
      return bin(n);
    }
  }


  public static void main(String[] args){
    int n=0, b=0;
    String bin="";
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    DecBin ob1 = new DecBin(n);
    bin = ob1.bin(n);
    StringBuffer sb = new StringBuffer(bin);
    bin = sb.reverse().toString();
    b = Integer.parseInt(bin);
    System.out.println("Binary of "+n+" is "+b);

    System.out.println("\nFor Object 2: ");
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    DecBin ob2 = new DecBin(n);
    bin = ob2.bin(n);
    sb = new StringBuffer(bin);
    bin = sb.reverse().toString();
    b = Integer.parseInt(bin);
    System.out.println("Binary of "+n+" is "+b);
    sc.close();
  }
}