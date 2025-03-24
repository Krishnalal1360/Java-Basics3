import java.util.Scanner;

public class Sorter{

  public int ar[], n;

  Sorter(int n){
    this.n = n;
    this.ar = new int[n];
  }

  public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the elements for the array: ");
    for(int i=0;i<ar.length;i++){
      System.out.print("Enter element at location ar["+i+"]: ");
      ar[i] = sc.nextInt();
      System.out.println();
    }
    sc.close();
  }

  public void display(){
    System.out.println("\nArray: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
  }

  public void min_max(){
    System.out.println("\nMinimum element: "+ar[0]);
    System.out.println("Maximum element: "+ar[ar.length-1]);
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
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter size for the array: ");
    int n = sc.nextInt();
    Sorter ob1 = new Sorter(n);
    ob1.input();
    ob1.display();
    ob1.sort();
    ob1.display();
    ob1.min_max();
    sc.close();
  }
}
