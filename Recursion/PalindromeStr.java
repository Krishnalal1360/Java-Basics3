import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class PalindromeStr{

  public String st, rev;
  public int len;

  PalindromeStr(){
    this.st = "";
    this.rev = "";
    this.len = 0;
  }

  public void getStr(String st){
    this.st = st;
    this.len = this.st.length()-1;
  }

  public String reverse(String st){
    if(this.len == -1){
      return this.rev;
    }else{
      this.rev = this.rev.concat(Character.toString(this.st.charAt(this.len)));
      this.len = this.len-1;
      return reverse(st);
    }
  }

  public void check(){
    if(this.st.equalsIgnoreCase(this.rev) == true){
      System.out.println("Word "+this.st+" is Palindrome!");
    }else{
      System.out.println("Word "+this.st+" is not Palindrome!");
    }
  }

  public static void main(String[] args){
    String st="", rev="";
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter a word: ");
    st = sc.next();
    PalindromeStr ob1 = new PalindromeStr();
    ob1.getStr(st);
    rev = ob1.reverse(st);
    System.out.println("Original Word: "+st);
    System.out.println("Reversed Word: "+rev);
    ob1.check();

    System.out.println("\nFor Object 2: ");
    System.out.println("Enter a word: ");
    st = sc.next();
    PalindromeStr ob2 = new PalindromeStr();
    ob2.getStr(st);
    rev = ob2.reverse(st);
    System.out.println("Original Word: "+st);
    System.out.println("Reversed Word: "+rev);
    ob2.check();
    sc.close();
  }
}