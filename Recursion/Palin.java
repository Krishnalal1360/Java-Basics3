import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;

public class Palin{

  public int num, revnum;
  public String rev;

  Palin(){
    this.num = 0;
    this.revnum = 0;
    this.rev = "";
  }

  public void accept(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    this.num = sc.nextInt();
  }

  public void reverse(){
    String r="";
    r = rev(this.num);
    this.revnum = Integer.parseInt(r);
  }

  public String rev(int n){
    int r=0;
    if(n == 0){
      return this.rev;
    }else{
      r = n%10;
      this.rev = this.rev.concat(Integer.toString(r));
      n = n/10;
      return rev(n);
    }
  }

  public void check(){
    if(this.num == this.revnum){
      System.out.println("Number "+this.num+" is Palindrome!");
    }else{
      System.out.println("Number "+this.num+" is not Palindrome!");
    }
  }

  public static void main(String[] args) {
    System.out.println("\nFor Object 1: ");
    Palin ob1 = new Palin();
    ob1.accept();
    ob1.reverse();
    ob1.check();
  }
}
