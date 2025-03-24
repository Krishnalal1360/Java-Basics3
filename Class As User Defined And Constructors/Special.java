import java.util.Scanner;

public class Special{

  public long arr[];
  public int N;

  Special(int nx){
    this.N = nx;
    this.arr = new long[N];
  }

  public void input_numbers(){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter elements for the array: ");
    for(int i=0;i<N;i++){
      System.out.print("Enter element at location arr["+i+"]: ");
      arr[i] = sc.nextLong();
      System.out.println();
    }
    sc.close();
  }

  public void print_special(){
    long n1=0l, n2=0l;
    System.out.println("\nSpecial numbers are: ");
    for(int i=0;i<N;i++){
      n1 = arr[i];
      n2 = fact(n1);
      if(n1 == n2){
        System.out.println(n1);
      }else{
        continue;
      }
    }
  }

  public long fact(long g){
    long s=0l, r=0l;
    while(g > 0){
      r = g%10;
      s = s+factorial(r);
      g = g/10;
    }
    return s;
  }

  public long factorial(long n){
    long f=1l;
    for(int i=2;i<=n;i++){
      f = f*i;
    }
    return f;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object ob1: ");
    System.out.println("Note: The limit for the size is 150.");
    System.out.println("Enter size for the array: ");
    int n = sc.nextInt();
    if(n > 150){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    Special ob1 = new Special(n);
    ob1.input_numbers();
    ob1.print_special();
    sc.close();
  }
}