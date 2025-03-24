import java.util.Scanner;
import java.lang.Math;

public class Binary{

  public int n, ar[], f, l, ele, flag, mid;

  Binary(){
    this.n = 0;
    this.ar = new int[this.n];
  }

  public void input(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size for the array: ");
    this.n = sc.nextInt();
    this.ar = new int[this.n];
    System.out.println("Enter elements for the array.");
    for(int i=0;i<this.n;i++){
      System.out.print("Enter element at location ar["+i+"]: ");
      this.ar[i] = sc.nextInt();
      System.out.println();
    }
    display();

    System.out.println("\nEnter element to be searched: ");
    this.ele = sc.nextInt();

    sort(this.ar);
    System.out.println("\nAfter sorting...");
    display();

    this.f = 0;
    this.l = this.n-1;
    this.mid = (this.f+this.l)/2;
    this.flag = 0;
    this.flag = bin(this.ar, this.f, this.l, this.mid, this.ele);
    if(this.flag != -1){
      System.out.println("\nElement "+this.ele+" is found at index "+this.flag);
    }else{
      System.out.println("\nElement "+this.ele+" is not found!");
    }
  }

  public void display(){
    System.out.println("Array is: ");
    for(int i=0;i<this.n;i++){
      System.out.println("ar["+i+"]="+this.ar[i]);
    }
  }

  public int bin(int ar[], int f, int l, int mid, int ele){
    if((f > l) || (l < f)){
      return -1;
    }else{
      if(ele == ar[mid]){
        return mid;
      }else if(ele < ar[mid]){
        l = mid-1;
        mid = (int)(Math.ceil((f+l)/2.0));
        return bin(ar, f, l, mid, ele);
      }else{
        f = mid+1;
        mid = (int)(Math.floor((f+l)/2.0));
        return bin(ar, f, l, mid, ele);
      }
    }
  }

  public void sort(int ar[]){
    int temp=0;
    for(int i=0;i<this.n-1;i++){
      temp = ar[i];
      for(int j=i+1;j<this.n;j++){
        if(ar[j] < ar[i]){
          ar[i] = ar[j];
          ar[j] = temp;
          temp = ar[i];
        }
      }
    }
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Binary ob1 = new Binary();
    ob1.input();
    
    System.out.println("\nFor Object 2: ");
    Binary ob2 = new Binary();
    ob2.input();
  }
}