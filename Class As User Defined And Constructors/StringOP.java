import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;
import java.util.StringTokenizer;

public class StringOP{

  public String st;

  StringOP(){
    this.st = "";
  }

  public void input(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a string: ");
    this.st = sc.nextLine();
    //sc.close();
  }

  public void process(){
    String rev="";
    System.out.println("\nOriginal string: \n"+st);
    StringBuffer sb = new StringBuffer(st);
    rev = sb.reverse().toString();
    System.out.println("\nReversed string: \n"+rev);
  }

  public void find(){
    StringTokenizer stt = new StringTokenizer(st, " ");
    int ct = stt.countTokens();
    int ws = ct-1;
    System.out.println("\nNumber of words: "+ct);
    System.out.println("\nNumber of white spaces: "+ws);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    StringOP ob1 = new StringOP();
    ob1.input();
    ob1.process();
    ob1.find();

    System.out.println("\nFor Object 2: ");
    StringOP ob2 = new StringOP();
    ob2.input();
    ob2.process();
    ob2.find();
    sc.close();
  }
}