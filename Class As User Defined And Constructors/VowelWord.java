import java.util.Scanner;
import java.lang.String;
import java.util.StringTokenizer;
import java.lang.Character;

public class VowelWord{

  public String str;
  public int freq;

  VowelWord(){
    this.str = "";
    this.freq = 0;
  }

  public void readstr(){
    char c='\u0000';
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The sentence must ends with a full stop.");
    System.out.println("There must be a single whitespace between words.");
    System.out.println("\nEnter a sentence: ");
    this.str = sc.nextLine();
    /*c = this.str.charAt(this.str.length()-1);
    if(c != '.'){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }*/
    if(this.str.endsWith(".") == false){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: Sentence does not ends with full stop.");
      System.exit(0);
    }
    StringTokenizer stt = new StringTokenizer(this.str, " ");
    int ct = stt.countTokens();
    int ws = ct-1;
    int cws=0;
    for(int i=0;i<this.str.length()-1;i++){
      c = this.str.charAt(i);
      if(Character.isWhitespace(c) == true){
        cws = cws+1;
      }else{
        continue;
      }
    }
    if(ws != cws){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: Single whitespace between words does not followed.");
      System.exit(0);
    }
  }

  public void freq_vowel(){
    char c='\u0000';
    String st="", st1="";
    this.str = this.str.concat(" ");
    for(int i=0;i<this.str.length();i++){
      c = this.str.charAt(i);
      if(Character.isWhitespace(c) == false){
        st = st.concat(Character.toString(c));
      }else{
        c = st.charAt(0);
        st1 = String.valueOf(c);
        if(st1.equalsIgnoreCase("A") || st1.equalsIgnoreCase("E") || st1.equalsIgnoreCase("I") || st1.equalsIgnoreCase("O") || st1.equalsIgnoreCase("U")){
          this.freq = this.freq+1;
        }
        st = "";
      }
    }
    this.str = this.str.trim();
  }

  public void display(){
    System.out.println("\nSentence: \n"+this.str);
    System.out.println("\nNumber of words that starts with a vowel: "+this.freq);
  }

  public static void main(String[] args) {
    System.out.println("\nFor Object 1: ");
    VowelWord ob1 = new VowelWord();
    ob1.readstr(); 
    ob1.freq_vowel();
    ob1.display();

    System.out.println("\nFor Object 2: ");
    VowelWord ob2 = new VowelWord();
    ob2.readstr(); 
    ob2.freq_vowel();
    ob2.display();
  }
}