import java.util.Scanner;

public class Convert{

  public int n;

  Convert(){
    this.n = 0;
  }

  public void impnum(int n){
    this.n = n;
  }

  public void extdigit(){
    System.out.println("\nNumber: "+n);
    int r=0;
    String w="";
    while(n > 0){
      r = n%10;
      w = " "+num_to_words(r)+w;
      n = n/10;
    }
    System.out.println("\nThe number in words is:"+w);
  }

  public String num_to_words(int n){
    if(n == 0){
      return "Zero";
    }else if(n == 1){
      return "One";
    }else if(n == 2){
      return "Two";
    }else if(n == 3){
      return "Three";
    }else if(n == 4){
      return "Four";
    }else if(n == 5){
      return "Five";
    }else if(n == 6){
      return "Six";
    }else if(n == 7){
      return "Seven";
    }else if(n == 8){
      return "Eight";
    }else if(n == 9){
      return "Nine";
    }else{
      return "";
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);  
    System.out.println("\nFor object 1: ");
    System.out.println("\nEnter a positive number: ");
    int n = sc.nextInt();
    Convert ob1 = new Convert();
    ob1.impnum(n);
    ob1.extdigit();

    System.out.println("\nFor object 2: ");
    System.out.println("\nEnter a positive number: ");
    n = sc.nextInt();
    Convert ob2 = new Convert();
    ob2.impnum(n);
    ob2.extdigit();
    sc.close();
  }
}