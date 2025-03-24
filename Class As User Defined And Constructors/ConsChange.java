import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class ConsChange{

  public String word;
  public int len;

  static public String sw="", cw="";

  ConsChange(){
    this.word = "";
    this.len = 0;
  }

  public void readword(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a word: ");
    this.word = sc.next();
    this.word = this.word.toLowerCase();
    this.len = this.word.length();
  }

  public void shiftcons(){
    char c='\u0000';
    String st1="", st2="";
    for(int i=0;i<this.len;i++){
      c = this.word.charAt(i);
      if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
        st1 = st1.concat(Character.toString(c));
      }else{
        st2 = st2.concat(Character.toString(c));
      }
    }
    sw = st1.concat(st2);
  }

  public void changeword(){
    char c='\u0000';
    for(int i=0;i<sw.length();i++){
      c = sw.charAt(i);
      if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
        c = Character.toUpperCase(c);
        cw = cw.concat(Character.toString(c));
      }else{
        cw = cw.concat(Character.toString(c));
      }
    }
  }

  public void show(){
    System.out.println("\nOriginal word: "+this.word);
    System.out.println("\nShifted word: "+sw);
    System.out.println("\nChanged word: "+cw);
    cw = "";
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    ConsChange ob1 = new ConsChange();
    ob1.readword(); 
    ob1.shiftcons();
    ob1.changeword();
    ob1.show();

    System.out.println("\nFor Object 2: ");
    ConsChange ob2 = new ConsChange();
    ob2.readword(); 
    ob2.shiftcons();
    ob2.changeword();
    ob2.show();
  }
}