import java.util.Scanner;
import java.lang.String;

public class Re_Arrange{

  public String txt, cxt;
  public int len;

  Re_Arrange(){
    this.txt = "";
    this.cxt = "";
    this.len = 0;
  }

  public void readWord(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a word: ");
    this.txt = sc.next();
    this.txt = this.txt.toUpperCase();
    this.len = this.txt.length();
  }

  public String convert(){
    if(this.txt.startsWith("A") || this.txt.startsWith("E") || this.txt.startsWith("I") || this.txt.startsWith("O") || this.txt.startsWith("U")){
      this.cxt = this.txt+"Y";
      return this.cxt;
    }
    char c='\u0000';
    int index=0;
    String st1="", st2="";
    for(int i=1;i<this.len-1;i++){
      c = this.txt.charAt(i);
      if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
        index = i;
        break;
      }
    }
    if((index > 0) && (index < this.len-1)){
      st1 = this.txt.substring(index, this.len);
      st2 = this.txt.substring(0, index);
      this.cxt = st1+st2+"C";
      return this.cxt;
    }
    int flag=0;
    for(int i=0;i<this.len;i++){
      c = this.txt.charAt(i);
      if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
        flag = 1;
        break;
      }else{
        continue;
      }
    }
    if(flag == 0){
      this.cxt = this.txt+"N";
      return this.cxt;
    }
    return this.cxt;
  }

  public void display(){
    System.out.println("\nOriginal word: "+this.txt);
    System.out.println("\nRe-Arranged word: "+this.cxt);
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Re_Arrange ob1 = new Re_Arrange();
    ob1.readWord();
    ob1.convert();
    ob1.display();

    System.out.println("\nFor Object 2: ");
    Re_Arrange ob2 = new Re_Arrange();
    ob2.readWord();
    ob2.convert();
    ob2.display();

    System.out.println("\nFor Object 3: ");
    Re_Arrange ob3 = new Re_Arrange();
    ob3.readWord();
    ob3.convert();
    ob3.display();
  }
}