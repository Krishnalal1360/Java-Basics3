import java.util.Scanner;
import java.lang.Math;

public class Myarray {

  public int ar[], n;

  Myarray(int n){
    this.n = n;
    this.ar = new int[n];
  }

  public void input(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter elements for the array: ");
    for(int i=0;i<ar.length;i++){
      System.out.print("Enter element at location ar["+i+"]: ");
      ar[i] = sc.nextInt();
      System.out.println();
    }
  }

  public void output(){
    System.out.println("\nArray: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
  }

  public void sort(){
    int temp=0;
    for(int i=0;i<ar.length-1;i++){
      temp = ar[i];
      for(int j=i+1;j<ar.length;j++){
        if(ar[j] < ar[i]){
          ar[i] = ar[j];
          ar[j] = temp;
          temp = ar[i];
        }
      }
    }
    output();
  }

  public void search(int e){
    System.out.println("\nAfter sorting: ");
    sort();
    int f, l, m;
    f = 0;
    l = ar.length-1;
    m = (f+l)/2;
    while(f <= l){
      if(ar[m] == e){
        System.out.println("\nElement "+e+" is found at location ar["+m+"].");
        System.exit(0);
      }
      if(f == l){
        System.out.println("\nElement "+e+" is not found!");
        System.exit(0);
      }
      if(e < ar[m]){
        l = m-1;
        m = (int)(Math.ceil((f+l)/2));
      }
      if(e > ar[m]){
        f = m+1;
        m = (int)(Math.floor((f+l)/2));
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter size for the array: ");
    int n = sc.nextInt();
    Myarray ob1 = new Myarray(n);
    ob1.input();
    ob1.output();
    System.out.println("\nEnter element to search: ");
    int e = sc.nextInt();
    ob1.search(e);
    sc.close();
  }
}