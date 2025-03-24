import java.util.Scanner;

public class Recursion{

  public int a, b, c, limit;
  public String st;

  Recursion(){
    this.a = 0;
    this.b = 1;
    this.c = 1;
    this.st = "";
  }

  public void accept(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the limit: ");
    this.limit = sc.nextInt();
  }

  public void generate(){
    if(this.limit == 1){
      this.st = "0";
    }else if(this.limit == 2){
      this.st = "0\t1";
    }else if(this.limit == 3){
      this.st = "0\t1\t1";
    }else{
      this.st = "0\t1\t1\t";
      this.a = this.b;
      this.b = this.c;
      this.c = this.a+this.b;
      this.st = fibo(4);
    }
  }

  public String fibo(int n){
    if(n == this.limit+1){
      return this.st;
    }else{
      this.st = this.st.concat(String.valueOf(this.c)+"\t");
      this.a = this.b;
      this.b = this.c;
      this.c = this.a+this.b;
      return fibo(n+1);
    }
  }

  public void display(){
    System.out.println("Fibonacci Series: \n"+this.st);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    Recursion ob1 = new Recursion();
    ob1.accept();
    ob1.generate();
    ob1.display();

    System.out.println("\nFor Object 2: ");
    Recursion ob2 = new Recursion();
    ob2.accept();
    ob2.generate();
    ob2.display();

    System.out.println("\nFor Object 3: ");
    Recursion ob3 = new Recursion();
    ob3.accept();
    ob3.generate();
    ob3.display();
    sc.close();
  }
}