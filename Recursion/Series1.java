import java.util.Scanner;

public class Series1{

  public int x, n;
  public float s;

  Series1(){
    this.x = 0;
    this.n = 0;
    this.s = 0.0f;
  }

  Series1(int xx, int nn){
    this.x = xx;
    this.n = nn;
  }

  public void sumseries(){
    int flag=0, index=2;
    this.s = 1.0f;
    for(int i=2;i<=this.n;i++){
      if(flag == 0){
        this.s = this.s+(power(this.x, index)/fact(index+1));
        index = index+1;
        flag = 1;
      }else{
        this.s = this.s-(power(this.x, index)/fact(index+1));
        index = index+1;
        flag = 0;
      }
    }
    System.out.println("Sum of the series: "+this.s);
  }

  public float power(int n, int p){
    if(p == 0){
      return 1;
    }else{
      return n*power(n, p-1);
    }
  }

  public float fact(int n){
    if(n == 1){
      return 1;
    }else{
      return n*fact(n-1);
    }
  }

  public static void main(String[] args){
    int x=0, n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter the value for x: ");
    x = sc.nextInt();
    System.out.println("Enter the number of terms: ");
    n = sc.nextInt();
    Series1 ob1 = new Series1(x, n);
    ob1.sumseries();

    System.out.println("\nFor Object 2: ");
    System.out.println("Enter the value for x: ");
    x = sc.nextInt();
    System.out.println("Enter the number of terms: ");
    n = sc.nextInt();
    Series1 ob2 = new Series1(x, n);
    ob2.sumseries();

    System.out.println("\nFor Object 3: ");
    System.out.println("Enter the value for x: ");
    x = sc.nextInt();
    System.out.println("Enter the number of terms: ");
    n = sc.nextInt();
    Series1 ob3 = new Series1(x, n);
    ob3.sumseries();
    sc.close();
  }
}