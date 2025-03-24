import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class Capital{

  public String sent;
  public int freq;

  Capital(){
    this.sent = "";
    this.freq = 0;
  }

  public void input(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the sentence: ");
    this.sent = sc.nextLine();
  }

  public boolean isCap(){
    String st="", st1="";
    char c='\u0000';
    st = String.valueOf(this.sent);
    st = st.toUpperCase();
    st = st.concat(" ");
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isWhitespace(c) == false){
        st1 = st1.concat(Character.toString(c));
      }else{
        c = st1.charAt(0);
        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
          this.freq = this.freq+1;
        }
        st1 = "";
      }
    }
    if(this.freq > 0){
      return true;
    }else{
      return false;
    }
  }

  public void display(){
    System.out.println("\nSentence: "+this.sent);
    System.out.println("\nFrequency: "+this.freq);
  }

  public static void main(String[] args){
    boolean flag=false;
    System.out.println("\nFor Object 1: ");
    Capital ob1 = new Capital();
    ob1.input();
    flag = ob1.isCap();
    if(flag == true){
      System.out.println("\nThere is/are words which begins with a vowel.");
    }else{
      System.out.println("\nThere is no words which begins with a vowel.");
    }
    ob1.display();

    System.out.println("\nFor Object 2: ");
    Capital ob2 = new Capital();
    ob2.input();
    flag = ob2.isCap();
    if(flag == true){
      System.out.println("\nThere is/are words which begins with a vowel.");
    }else{
      System.out.println("\nThere is no words which begins with a vowel.");
    }
    ob2.display();
  }
}