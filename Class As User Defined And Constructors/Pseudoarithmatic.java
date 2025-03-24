import java.util.Scanner;

public class Pseudoarithmatic{

  public int n, a[], sum;
  public boolean ansflag;

  Pseudoarithmatic(){
    this.n = 0;
    this.a = new int[0];
    this.ansflag = false;
    this.sum = 0;
  }

  public void accept(int nn){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    this.n = nn;
    this.a = new int[this.n];
    System.out.println("\nEnter elements for the array.");
    for(int i=0;i<this.a.length;i++){
      System.out.print("Enter element at location a["+i+"]: ");
      a[i] = sc.nextInt();
      System.out.println();
    }
    for(int i=0;i<this.a.length-1;i++){
      if(this.a[i] >= this.a[i+1]){
        System.out.println("\nInvalid Input!");
        System.exit(0);
      }
    }
  }

  public void display(){
    System.out.println("\nArray: ");
    for(int i=0;i<this.a.length;i++){
      System.out.println("a["+i+"]="+a[i]);
    }
  }

  public boolean check(){
    this.sum = a[0]+a[this.n-1];
    int s=0;
    if(this.n%2 == 0){
      for(int i=0;i<this.n/2;i++){
        s = a[i]+a[this.n-1-i];
        if(s != this.sum){
          this.ansflag = false;
          return this.ansflag;
        }else{
          continue;
        }
      }
    }else{
      for(int i=0;i<this.n/2;i++){
        s = a[i]+a[this.n-1-i];
        if(s != this.sum){
          this.ansflag = false;
          return this.ansflag;
        }else{
          continue;
        }
      }
      s = a[this.n/2];
      s = s*2;
      if(s != this.sum){
        this.ansflag = false;
        return this.ansflag;
      }
    }
    return true;
  }

  public static void main(String[] args){
    int n=0;
    boolean flag=false;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The elements must be in ascending order.");
    System.out.println("No duplicate elements are allowed.");
    System.out.println("\nFor Object 1: ");
    Pseudoarithmatic ob1 = new Pseudoarithmatic();
    System.out.println("\nEnter size for the array: ");
    n = sc.nextInt();
    ob1.accept(n);
    ob1.display();
    flag = ob1.check();
    if(flag == true){
      System.out.println("\nIt is a pseudo-arithmetic sequence.");
    }else{
      System.out.println("\nIt is not a pseudo-arithmetic sequence.");
    }

    System.out.println("\nFor Object 2: ");
    Pseudoarithmatic ob2 = new Pseudoarithmatic();
    System.out.println("\nEnter size for the array: ");
    n = sc.nextInt();
    ob2.accept(n);
    ob2.display();
    flag = ob2.check();
    if(flag == true){
      System.out.println("\nIt is a pseudo-arithmetic sequence.");
    }else{
      System.out.println("\nIt is not a pseudo-arithmetic sequence.");
    }
    sc.close();
  }
}