import java.util.Scanner;

public class Admission{

  public int n, ar[], ele, f, l, mid;

  Admission(){
    this.n = 0;
    this.ar = new int[this.n];
    this.ele = 0;
    this.f = this.l = this.mid = 0;
  }

  public void fill(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the number of students: ");
    this.n = sc.nextInt();
    this.ar = new int[this.n];
    System.out.println("\nEnter admission number for the students.");
    for(int i=0;i<this.ar.length;i++){
      System.out.print("Enter Admission Number for Student "+(i+1)+": ");
      this.ar[i] = sc.nextInt();
      System.out.println();
    }
  }

  public void display(){
    System.out.println("\nAdmission Number of Students: ");
    for(int i=0;i<this.ar.length;i++){
      System.out.println("Student "+(i+1)+": "+this.ar[i]);
    }
  }

  public void sort(){
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

  public void binarySearch(){
    int flag=0;
    @SuppressWarnings("resource") 
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter admission number to search: ");
    this.ele = sc.nextInt();
    this.f = 0;
    this.l = this.n-1;
    this.mid = (this.f+this.l)/2;
    flag = bin(this.ar, this.f, this.l, this.mid, this.ele);
    if(flag != -1){
      System.out.println("\nStudent Admission Number is found at index "+flag);
    }else{
      System.out.println("\nStudent Admission Number "+this.ele+" is not found!");
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

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Admission ob1 = new Admission();
    ob1.fill();
    ob1.display();
    ob1.sort();
    System.out.println("\nAfter Sorting:");
    ob1.display();
    ob1.binarySearch();

    System.out.println("\nFor Object 2: ");
    Admission ob2 = new Admission();
    ob2.fill();
    ob2.display();
    ob2.sort();
    System.out.println("\nAfter Sorting:");
    ob2.display();
    ob2.binarySearch();
  }
}