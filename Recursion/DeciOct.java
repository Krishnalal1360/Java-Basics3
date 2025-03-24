import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;
import java.lang.StringBuffer;

public class DeciOct{

  public int n, oct;
  public String st;

  DeciOct(){
    this.n = 0;
    this.oct = 0;
    this.st = "";
  }

  public void getnum(int nn){
    this.n = nn;
  }

  public String oct(int n){
    int r=0;
    if(n == 0){
      return this.st;
    }else{
      r = n%8;
      this.st = this.st.concat(Integer.toString(r));
      n = n/8;
      return oct(n);
    }
  }

  public void decioct(){
    this.st = oct(this.n);
    StringBuffer sb = new StringBuffer(this.st);
    this.st = sb.reverse().toString();
  }

  public void show(){
    System.out.println("\nDecimal Number: " + this.n);
    this.oct = Integer.valueOf(this.st);
    System.out.println("\nOctal Number: " + this.oct);
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    DeciOct ob1 = new DeciOct();
    System.out.println("\nEnter a decimal number: ");
    n = sc.nextInt();
    ob1.getnum(n);
    ob1.decioct();
    ob1.show();

    System.out.println("\nFor Object 2: ");
    DeciOct ob2 = new DeciOct();
    System.out.println("\nEnter a decimal number: ");
    n = sc.nextInt();
    ob2.getnum(n);
    ob2.decioct();
    ob2.show();
    sc.close();
  }
}