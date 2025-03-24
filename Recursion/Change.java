import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class Change{

  public String str, newstr;
  public int len;

  Change(){
    this.str = "";
    this.newstr = "";
    this.len = 0;
  }

  public void accept(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word: ");
    this.str = sc.next();
  }

  public String change(String st){
    char c='\u0000';
    if(this.len == st.length()){
      return this.newstr;
    }else{
      c = st.charAt(this.len);
      if(Character.isUpperCase(c) == true){
        c = Character.toLowerCase(c);
        this.newstr = this.newstr.concat(Character.toString(c));
      }else if(Character.isLowerCase(c) == true){
        c = Character.toUpperCase(c);
        this.newstr = this.newstr.concat(Character.toString(c));
      }else{
        this.newstr = this.newstr.concat(Character.toString(c));
      }
      this.len = this.len+1;
      return change(this.str);
    }
  }

  public void casechange(){
    change(this.str);
  }

  public void display(){
    System.out.println("Original Word: "+this.str);
    System.out.println("Changed Word: "+this.newstr);
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Change ob1 = new Change();
    ob1.accept();
    ob1.casechange();
    ob1.display();

    System.out.println("\nFor Object 2: ");
    Change ob2 = new Change();
    ob2.accept();
    ob2.casechange();
    ob2.display();

    System.out.println("\nFor Object 3: ");
    Change ob3 = new Change();
    ob3.accept();
    ob3.casechange();
    ob3.display();
  }
}