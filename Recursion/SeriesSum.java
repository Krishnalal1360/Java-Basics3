import java.util.Scanner;

public class SeriesSum{

  public int x, n;
  public float sum;

  SeriesSum(int xx, int nn){
    this.x = xx;
    this.n = nn;
    this.sum = 0.0f;
  }

  public void calculate(){
    int index1=0, index2=0;
    index1 = 2;
    index2 = 1;
    for(int i=1;i<=n;i++){
      this.sum = this.sum+(power(this.x, index1)/fact(index2));
      index1 = index1+2;
      index2 = index2+2;
    }
  }

  public float fact(int n){
    if(n == 1){
      return 1;
    }else{
      return n*fact(n-1);
    }
  }

  public float power(int x, int p){
    if(p == 0){
      return 1;
    }else{
      return x*power(x, p-1);
    }
  }

  public void display(){
    System.out.println("Sum of the series: "+this.sum);
  }


  public static void main(String[] args){
    int x=0, n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.print("Enter the value of x: ");
    x = sc.nextInt();
    System.out.println("Enter the number of terms: ");
    n = sc.nextInt();
    SeriesSum ob1 = new SeriesSum(x, n);
    ob1.calculate();
    ob1.display();

    System.out.println("\nFor Object 2: ");
    System.out.print("Enter the value of x: ");
    x = sc.nextInt();
    System.out.println("Enter the number of terms: ");
    n = sc.nextInt();
    SeriesSum ob2 = new SeriesSum(x, n);
    ob2.calculate();
    ob2.display();

    System.out.println("\nFor Object 3: ");
    System.out.print("Enter the value of x: ");
    x = sc.nextInt();
    System.out.println("Enter the number of terms: ");
    n = sc.nextInt();
    SeriesSum ob3 = new SeriesSum(x, n);
    ob3.calculate();
    ob3.display();
    sc.close();
  }
}