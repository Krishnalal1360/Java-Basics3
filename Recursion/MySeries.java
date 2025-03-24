import java.util.Scanner;

public class MySeries{

  public int x, n;

  MySeries(){
    this.x = 0;
    this.n = 0;
  }

  public void getnum(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value for x: ");
    this.x = sc.nextInt();
    System.out.println("Enter the value for n: ");
    this.n = sc.nextInt();
  }

  public void findsum(){
    int index1=2, index2=1;
    float s=0.0f;
    for(int i=1;i<=this.n;i++){
      s = s+(i*getpower(this.x, index1)/findfact(index2));
      index1 = index1+2;
      index2 = index2+1;
    }
    System.out.println("The sum of the series is: "+s);
  }

  public float getpower(int n, int p){
    if(p == 0){
      return 1;
    }else{
      return n*(getpower(n, p-1));
    }
  }

  public float findfact(int n){
    if(n == 1){
      return 1;
    }else{
      return n*(findfact(n-1));
    }
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    MySeries ob1 = new MySeries();
    ob1.getnum();
    ob1.findsum();

    System.out.println("\nFor Object 2: ");
    MySeries ob2 = new MySeries();
    ob2.getnum();
    ob2.findsum();

    System.out.println("\nFor Object 3: ");
    MySeries ob3 = new MySeries();
    ob3.getnum();
    ob3.findsum();
  }
}