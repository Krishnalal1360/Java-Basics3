import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
import java.lang.StringBuffer;

public class Modify{

  public String str;
  public int len;

  public void read(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a string: ");
    this.str = sc.nextLine();
    this.str = this.str.toUpperCase();
    this.len = this.str.length();
    System.out.println("\nString: \n"+this.str);
    System.out.println("\nLength: "+this.len);
    System.out.println("\nString in array format: ");
    for(int i=0;i<this.len;i++){
      System.out.println("str["+i+"]="+this.str.charAt(i));
    }
  }

  public void putin(int pos, char c){
    if((pos < 0) || (pos > this.len-1)){
      System.out.println("\nInvalid Index!");
      System.exit(0);
    }
    int a=0;
    a = (int)(c);
    if((a < 65) || (a > 90)){
      System.out.println("\nInvalid Character!");
      System.exit(0);
    }
    StringBuffer sb = new StringBuffer(this.str);
    sb.setCharAt(pos, c);
    this.str = sb.toString();
    System.out.println("\nModified String: \n"+this.str);
  }

  public void takeout(int pos){
    if((pos < 0) || (pos > this.len-1)){
      System.out.println("\nInvalid Index!");
      System.exit(0);
    }
    StringBuffer sb = new StringBuffer(this.str);
    sb.deleteCharAt(pos);//to delete one character
    //sb.delete(pos, pos);//to delete more than one character
    this.str = sb.toString();
    System.out.println("\nModified String: \n"+this.str);
  }

  public void change(int m){
    int a=0, d=0;
    char c='\u0000';
    StringBuffer sb = new StringBuffer(this.str);
    for(int i=0;i<sb.length();i++){
      c = sb.charAt(i);
      if(Character.isUpperCase(c) == true){
        a = (int)(c+m);
        if(a > 90){
          d = a-90;
          a = 64+d;
        }
        c = (char)(a);
        sb.setCharAt(i, c);
      }else{
        continue;
      }
    }
    this.str = sb.toString();
    System.out.println("\nModified String: \n"+this.str);
  }
  
  public static void main(String[] args){
    int ind=0, mov=0;
    char c='\u0000';
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor object 1: ");
    Modify ob1 = new Modify();
    ob1.read();
    System.out.println("\nEnter the index to insert: ");
    ind = sc.nextInt();
    System.out.println("\nEnter the character to insert: ");
    c = sc.next().charAt(0);
    c = Character.toUpperCase(c);
    ob1.putin(ind, c);
    System.out.println("\nEnter the index to delete: ");
    ind = sc.nextInt();
    ob1.takeout(ind);
    System.out.println("\nEnter the number of moves: ");
    mov = sc.nextInt();
    ob1.change(mov);

    System.out.println("\nFor object 2: ");
    Modify ob2 = new Modify();
    ob2.read();
    System.out.println("\nEnter the index to insert: ");
    ind = sc.nextInt();
    System.out.println("\nEnter the character to insert: ");
    c = sc.next().charAt(0);
    c = Character.toUpperCase(c);
    ob2.putin(ind, c);
    System.out.println("\nEnter the index to delete: ");
    ind = sc.nextInt();
    ob2.takeout(ind);
    System.out.println("\nEnter the number of moves: ");
    mov = sc.nextInt();
    ob2.change(mov);
    sc.close();
  }
}