import java.util.Scanner;

public class Happy{

  public int n, s;

  Happy(){
    this.n = 0;
    this.s = 0;
  }

  public void getnum(int nn){
    this.n = nn;
  }

  public int square(int n){
    int r=0, s=0;
    while(n > 0){
      r = n%10;
      s = s+(r*r);
      n = n/10;
    }
    return s;
  }

  public int sum(int n){
    if(n < 10){
      return this.s;
    }else{
      this.s = square(n);
      return sum(this.s);
    }
  }

  public void isHappy(){
    sum(this.n);
    if(this.s == 1){
      System.out.println("Number "+this.n+" is Happy!");
    }else{
      System.out.println("Number "+this.n+" is not Happy!");
    }
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    Happy ob1 = new Happy();
    ob1.getnum(n);
    ob1.isHappy();

    System.out.println("\nFor Object 2: ");
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    Happy ob2 = new Happy();
    ob2.getnum(n);
    ob2.isHappy();
    sc.close();
  }
}
