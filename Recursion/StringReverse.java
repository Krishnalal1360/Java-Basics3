import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class StringReverse{

  public String st, rev;
  public int len;

  StringReverse(String st){
    this.st = st;
    this.len = this.st.length()-1;
    this.rev = "";
  }

  public String rev(String st){
    if(this.len == -1){
      return this.rev;
    }else{
      this.rev = this.rev.concat(Character.toString(this.st.charAt(this.len)));
      this.len = this.len-1;
      return rev(this.st);
    }
  }


  public static void main(String[] args){
    String st="", rev="";
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter a string: ");
    st = sc.nextLine();
    StringReverse ob1 = new StringReverse(st);
    rev = ob1.rev(st);
    System.out.println("Original String: "+st);
    System.out.println("Reversed String: "+rev);

    System.out.println("\nFor Object 2: ");
    System.out.println("Enter a string: ");
    st = sc.nextLine();
    StringReverse ob2 = new StringReverse(st);
    rev = ob2.rev(st);
    System.out.println("Original String: "+st);
    System.out.println("Reversed String: "+rev);
    sc.close();
  }
}