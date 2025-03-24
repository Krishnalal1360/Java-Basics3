import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;

public class SortWord{

  public String txt;
  public int len;

  SortWord(){
    this.txt = "";
    this.len = 0;
  }

  public void readTxt(String w){
    this.txt = w;
    this.txt = this.txt.toLowerCase();
    this.len = this.txt.length();
    System.out.println("\nOriginal word: "+this.txt);
  }

  public void sortTxt(){
    char temp='\u0000';
    String st="";
    StringBuffer sb = new StringBuffer(this.txt);
    for(int i=0;i<sb.length()-1;i++){
      temp = sb.charAt(i);
      for(int j=i+1;j<sb.length();j++){
        if(sb.charAt(j) < sb.charAt(i)){
          sb.setCharAt(i, sb.charAt(j));
          sb.setCharAt(j,temp);
          temp = sb.charAt(i);
        }
      }
    }
    st = sb.toString();
    disp(st);
  }

  public void disp(String st){
    System.out.println("\nModified word: "+st);
  }

  public void changeTxt(){
    char c='\u0000';
    String st="";
    StringBuffer sb = new StringBuffer(this.txt);
    for(int i=0;i<sb.length();i++){
      c = sb.charAt(i);
      if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
        sb.setCharAt(i, Character.toUpperCase(c));
      }else{
        continue;
      }
    }
    st = sb.toString();
    disp(st);
  }

  public static void main(String[] args){
    String w="";
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor object 1: ");
    SortWord ob1 = new SortWord();
    System.out.println("\nEnter a word: ");
    w = sc.next();
    ob1.readTxt(w);
    ob1.sortTxt();
    ob1.changeTxt();

    System.out.println("\nFor object 2: ");
    SortWord ob2 = new SortWord();
    System.out.println("\nEnter a word: ");
    w = sc.next();
    ob2.readTxt(w);
    ob2.sortTxt();
    ob2.changeTxt();
    sc.close();
  }
}
