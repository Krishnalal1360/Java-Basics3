import java.util.Scanner;
import java.lang.String;
import java.lang.Math;  

public class Disarium{

  public int n, ar[], l, u;

  Disarium(){
    this.n = 0;
    this.ar = new int[this.n];
    this.l = this.u = 0;
  }

  public void accept(){
    int index=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter lower limit: ");
    this.l = sc.nextInt();
    System.out.println("Enter upper limit: ");
    this.u = sc.nextInt();
    this.n = (this.u-this.l)+1;
    this.ar = new int[this.n];
    index = this.l;
    for(int i=0;i<this.ar.length;i++){
      this.ar[i] = index;
      index = index+1;
    }
  }

  public void display(){
    System.out.println("Array: ");
    for(int i=0;i<this.ar.length;i++){
      System.out.println("ar["+i+"]="+this.ar[i]);
    }
  }

  public int check(int n, int len, int r, int s){
    if(n == 0){
      return s;
    }else{
      r = n%10;
      s = s+(int)(Math.pow(r, len));
      n = n/10;
      len = len-1;
      return check(n, len, r, s);
    }
  }

  public void isDisarium(){
    int ds=0, freq=0, len=0, r=0, s=0;
    String st="";
    System.out.println("\nDisarium number inclusive between "+this.l+" and "+this.u+" are: ");
    for(int i=0;i<this.ar.length;i++){
      st = String.valueOf(this.ar[i]);
      len = st.length();
      ds = check(ar[i], len, r, s);
      if(ds == ar[i]){
        System.out.println(ar[i]+" is Disarium!");
        freq = freq+1;
      }
    }
    System.out.println("\nFrequency of Disarium numbers: "+freq);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    Disarium ob1 = new Disarium();
    ob1.accept();
    ob1.display();
    ob1.isDisarium();

    System.out.println("\nFor Object 2: ");
    Disarium ob2 = new Disarium();
    ob2.accept();
    ob2.display();
    ob2.isDisarium();
    sc.close();
  }
}