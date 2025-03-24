import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class UpperStr{

  public String st, ust;
  public int len;

  UpperStr(){
    this.st = "";
    this.len = 0;
    this.ust = "";
  }

  public void accept(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    this.st = sc.nextLine();
  }

  public void upper(){
    upr(this.st, this.len);
  }

  public String upr(String st, int len){
    char c='\u0000';
    if(len == this.st.length()){
      return this.ust;
    }else{
      c = this.st.charAt(len);
      if(Character.isUpperCase(c) == true){
        this.ust = this.ust.concat(Character.toString(c));
      }
      len = len+1;
      return upr(this.st, len);
    }
  }

  public void display(){
    System.out.println("\nOriginal String: \n"+this.st);
    System.out.println("\nUpper Case Letters in String are:");
    for(int i=0;i<this.ust.length();i++){
      System.out.println(this.ust.charAt(i));
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    UpperStr ob1 = new UpperStr();
    ob1.accept();
    ob1.upper();
    ob1.display();
    sc.close();
  }
}
