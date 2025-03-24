import java.util.Scanner;

public class Prime_Series1{

  public int n, arr[], l, u;

  Prime_Series1(){
    this.n = 0;
    this.arr = new int[this.n];
    this.l = this.u = 0;
  }

  public void accept(){
    int index=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the lower limit: ");
    this.l = sc.nextInt();
    System.out.println("Enter the upper limit: ");
    this.u = sc.nextInt();
    this.n = (this.u-this.l)+1;
    this.arr = new int[this.n];
    index = this.l;
    for(int i=0;i<this.arr.length;i++){
      arr[i] = index;
      index = index+1;
    }
  }

  public void display(){
    System.out.println("The array is: ");
    for(int i=0;i<this.n;i++){
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
    for(int i=0;i<this.n;i++){
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
    Prime_Series1 ob1 = new Prime_Series1();
    ob1.accept();
    ob1.display();
    ob1.displayPrime();
    sc.close();
  }
}
