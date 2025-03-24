import java.util.Scanner;
import java.lang.String;  
import java.lang.Character;

public class Piglatin{

  public String txt;
  public int len;

  Piglatin(){
    this.txt = "";
    this.len = 0;
  }

  public void readstring(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a word in Uppercase: ");
    txt = sc.next();
    char c='\u0000';
    int flag=0;
    len = txt.length();
    for(int i=0;i<len;i++){
      c = txt.charAt(i);
      if(Character.isLetter(c) == true){
        if(Character.isUpperCase(c) == true){
          continue;
        }else{
          flag = 1;
          break;
        }
      }
    }
    if(flag == 1){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
  }

  public void convert(){
    char c='\u0000';
    int index=0;
    for(int i=0;i<len;i++){
      c = txt.charAt(i);
      if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
        index = i;
        break;
      }
    }
    String st1 = txt.substring(0, index);
    String st2 = txt.substring(index, len);
    String st3 = st2+st1+"AY";
    System.out.println("\nOriginal word: "+txt);
    System.out.println("\nPigLatin word: "+st3);
  }

  public void consonant(){
    char c='\u0000';
    int cons=0;
    for(int i=0;i<len;i++){
      c = txt.charAt(i);
      if(c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U'){
        cons = cons+1;
      }
    }
    System.out.println("\nNumber of consonants: "+cons);
  }

  public static void main(String[] args){
    System.out.println("\nFor object 1: ");
    Piglatin ob1 = new Piglatin();
    ob1.readstring();
    ob1.convert();
    ob1.consonant();

    System.out.println("\nFor object 2: ");
    Piglatin ob2 = new Piglatin();
    ob2.readstring();
    ob2.convert();
    ob2.consonant();
  }
}