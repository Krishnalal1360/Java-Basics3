import java.util.Scanner;
import java.lang.String;
import java.util.StringTokenizer;
import java.lang.Character;

public class TheString{

  public String str;
  public int len, wordcount, cons;

  TheString(){
    this.str = "";
    this.len = 0;
    this.wordcount = 0;
    this.cons = 0;
  }

  TheString(String ds){
    this.str = ds;
    this.len = str.length();
    if(len > 100){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
  }

  public void countFreq(){
    StringTokenizer stt = new StringTokenizer(str, " ");
    wordcount = stt.countTokens();
    char c='\u0000', c1='\u0000';
    String st="";
    str = str.concat(" ");
    for(int i=0;i<str.length();i++){
      c = str.charAt(i);
      if(Character.isWhitespace(c) == false){
        st = st.concat(String.valueOf(c));
      }else{
        st = st.toUpperCase();
        for(int j=0;j<st.length();j++){
          c1 = st.charAt(j);
          if((c1 != 'A') && (c1 != 'E') && (c1 != 'I') && (c1 != 'O') && (c1 != 'U')){
            cons = cons+1;
          }else{
            continue;
          }
        }
        st = "";
      }
    }
  }

  public void display(){
    System.out.println("\nString: \n"+str);
    System.out.println("\nLength: "+len);
    System.out.println("\nNumber of words: "+wordcount);
    System.out.println("\nNumber of consonants: "+cons);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The maximum number of characters must be atmost 100.");
    System.out.println("\nFor Object 1: ");
    System.out.println("\nEnter a string: ");
    String st = sc.nextLine();
    TheString ob1 = new TheString(st);
    ob1.countFreq();
    ob1.display();

    System.out.println("\nFor Object 2: ");
    System.out.println("\nEnter a string: ");
    st = sc.nextLine();
    TheString ob2 = new TheString(st);
    ob2.countFreq();
    ob2.display();
    sc.close();
  }
}