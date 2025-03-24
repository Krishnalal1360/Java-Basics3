import java.util.Scanner;
import java.lang.String;
import java.util.StringTokenizer;
import java.lang.Character;
import java.lang.StringBuffer;

public class Exchange{

  public String sent, rev;

  public Exchange(){
    this.sent = "";
    this.rev = "";
  }

  public void readSentence(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The sentence must ends with a full stop.");
    System.out.println("There must be a single whitespace between words.");
    System.out.println("\nEnter a sentence: ");
    sent = sc.nextLine();
    char c='\u0000';
    c = sent.charAt(sent.length()-1);
    if(c != '.'){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    StringTokenizer stt = new StringTokenizer(sent, " ");
    int ct = stt.countTokens();
    int ws = ct-1;
    int cws=0;
    for(int i=0;i<sent.length();i++){
      c = sent.charAt(i);
      if(Character.isWhitespace(c) == true){
        cws = cws+1;
      }
    }
    if(ws != cws){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
  }

  public void exFirstLast(){
    sent = sent.replace('.', ' ');
    char c='\u0000', c1='\u0000', c2='\u0000';
    String st="";
    for(int i=0;i<sent.length();i++){
      c = sent.charAt(i);
      if(Character.isWhitespace(c) == false){
        st = st.concat(Character.toString(c));
      }else if(c == ' '){
        StringBuffer sb = new StringBuffer(st);
        c1 = sb.charAt(0);
        c2 = sb.charAt(sb.length()-1);
        sb.setCharAt(0, c2);
        sb.setCharAt(sb.length()-1, c1);
        rev = rev.concat(sb.toString());
        rev = rev.concat(" ");
        st = "";
      }
    }
    rev = rev.trim();
  }

  public void display(){
    System.out.println("\nOriginal Sentence: \n"+sent);
    System.out.println("\nModified Sentence: \n"+rev);
  }

  public static void main(String[] args){
    System.out.println("\nFor object 1: ");
    Exchange ob1 = new Exchange();
    ob1.readSentence();
    ob1.exFirstLast();
    ob1.display();
  }
}