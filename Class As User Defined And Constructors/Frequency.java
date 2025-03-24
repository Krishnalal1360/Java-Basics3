import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class Frequency{

  public String text;
  public int countand, countan, len;

  Frequency(){
    this.text = "";
    this.countand = 0;
    this.countan = 0;
    this.len = 0;
  }

  public void accept(String n){
    this.text = n;
    System.out.println("\nOriginal text: \n"+this.text);
    this.len = this.text.length();
    this.text = this.text.replace(this.text.charAt(this.len-1), ' ');
  }

  public void checkandfreq(){
    char c='\u0000';
    String st="";
    for(int i=0;i<this.len;i++){
      c = this.text.charAt(i);
      if(Character.isWhitespace(c) == false){
        st = st.concat(Character.toString(c));
      }else{
        if(st.equalsIgnoreCase("and") == true){
          this.countand = this.countand+1;
        }
        st = "";
      }
    }
  }

  public void checkanfreq(){
    char c='\u0000';
    String st="";
    for(int i=0;i<this.len;i++){
      c = this.text.charAt(i);
      if(Character.isWhitespace(c) == false){
        st = st.concat(Character.toString(c));
      }else{
        if(st.equalsIgnoreCase("an") == true){
          this.countan = this.countan+1;
        }
        st = "";
      }
    }
  }

  public void display(){
    System.out.println("\nFrequency of 'and': "+this.countand);
    System.out.println("\nFrequency of 'an': "+this.countan);
  }

  public static void main(String[] args){
    String st="";
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    Frequency ob1 = new Frequency();
    System.out.println("\nEnter a text: ");
    st = sc.nextLine();
    ob1.accept(st);
    ob1.checkandfreq();
    ob1.checkanfreq();
    ob1.display();

    System.out.println("\nFor Object 2: ");
    Frequency ob2 = new Frequency();
    System.out.println("\nEnter a text: ");
    st = sc.nextLine();
    ob2.accept(st);
    ob2.checkandfreq();
    ob2.checkanfreq();
    ob2.display();
    sc.close();
  }
}