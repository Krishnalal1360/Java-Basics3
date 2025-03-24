import java.util.Scanner;

public class Prime_Series{

  public int limit, arr[];

  Prime_Series(){
    this.limit = 0;
    this.arr = new int[this.limit];
  }

  public void accept(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the limit: ");
    this.limit = sc.nextInt();
    this.arr = new int[this.limit];
    System.out.println("Enter elements for the array.");
    for(int i=0;i<this.arr.length;i++){
      System.out.print("Enter element at location arr["+i+"]: ");
      arr[i] = sc.nextInt();
      System.out.println();
    }
  }

  public void display(){
    System.out.println("The array is: ");
    for(int i=0;i<this.limit;i++){
      System.out.println("arr["+i+"]="+this.arr[i]);
    }
  }

  public int isPrime(int n, int count, int num){
    if(n <= 2){
      return count;
    }else{
      if(num%n == 0){
        count = count+1;
      }
      return isPrime(n-1, count, num);
    }
  }

  public void displayPrime(){
    int n=0, f=0, freq=0, count=0;
    System.out.println("Prime numbers in the array are: ");
    for(int i=0;i<this.limit;i++){
      n = this.arr[i];
      if((n < 2) || (n == 4)){
        continue;
      }
      f = isPrime(n/2, count, n);
      if(f == 0){
        System.out.println(n+" is Prime!");
        freq = freq+1;
      }
      f = 0;
    }
    System.out.println("Frequency of Prime numbers: "+freq);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    System.out.println("\nFor Object 1: ");
    Prime_Series ob1 = new Prime_Series();
    ob1.accept();
    ob1.display();
    ob1.displayPrime();
    sc.close();
  }
}
