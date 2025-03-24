import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;

public class SwapSort{

  public String wrd, swapwrd, sortwrd;
  public int len;

  SwapSort(){
    this.wrd = "";
    this.swapwrd = "";
    this.sortwrd = "";
    this.len = 0;
  }

  public void readwrd(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a word: ");
    this.wrd = sc.next();
    this.wrd = this.wrd.toUpperCase();
    this.len = this.wrd.length();
  }

  public void swapwrd(){
    char c='\u0000', c1='\u0000';
    StringBuffer sb = new StringBuffer(this.wrd);
    for(int i=0;i<sb.length()/2;i++){
      c = sb.charAt(i);
      c1 = sb.charAt(sb.length()-1-i);
      sb.setCharAt(i, c1);
      sb.setCharAt(sb.length()-1-i, c);
    }
    this.swapwrd = sb.toString();
  }

  public void sortwrd(){
    char temp='\u0000'; 
    StringBuffer sb = new StringBuffer(this.wrd);
    for(int i=0;i<sb.length()-1;i++){
      temp = sb.charAt(i);
      for(int j=i+1;j<sb.length();j++){
        if(sb.charAt(j) < sb.charAt(i)){
          sb.setCharAt(i, sb.charAt(j));
          sb.setCharAt(j, temp);
          temp = sb.charAt(i);
        }
      }
    }
    this.sortwrd = sb.toString();
  }

  public void display(){
    System.out.println("\nOriginal Word: "+this.wrd);
    System.out.println("\nSwapped Word: "+this.swapwrd);
    System.out.println("\nSorted Word: "+this.sortwrd);
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    SwapSort ob1 = new SwapSort();
    ob1.readwrd();
    ob1.swapwrd();
    ob1.sortwrd();
    ob1.display();

    System.out.println("\nFor Object 2: ");
    SwapSort ob2 = new SwapSort();
    ob2.readwrd();
    ob2.swapwrd();
    ob2.sortwrd();
    ob2.display();
  }
}
