import java.util.Scanner;

public class Mixer{

  public int n, arr[];

  Mixer(int nn){
    this.n = nn;
    this.arr = new int[n];
  }

  public void accept(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The elements must be in ascending order.");
    System.out.println("No duplicate elements are allowed.");
    System.out.println("\nEnter elements for the array.");
    for(int i=0;i<arr.length;i++){
      System.out.print("Enter element at location arr["+i+"]: ");
      arr[i] = sc.nextInt();
      System.out.println();
    }
    for(int i=0;i<arr.length-1;i++){
      if(arr[i] >= arr[i+1]){
        System.out.println("\nInvalid Input!");
        System.exit(0);
      }
    }
  }

  public void display(){
    System.out.println("\nArray: ");
    for(int i=0;i<arr.length;i++){
      if(arr[i] == 0){
        break;
      }
      System.out.println("arr["+i+"]="+arr[i]);
    }
  }

  Mixer(Mixer ob1, Mixer ob2){
    this.n = ob1.n + ob2.n;
    this.arr = new int[n];
  }

  public void mix(Mixer ob1, Mixer ob2){
    int i, j, k;
    i=j=k=0;
    while((i < ob1.arr.length) && (j < ob2.arr.length)){
      if(ob1.arr[i] < ob2.arr[j]){
        this.arr[k] = ob1.arr[i];
        i = i+1;
        k = k+1;
      }
      if(ob2.arr[j] < ob1.arr[i]){
        this.arr[k] = ob2.arr[j];
        j = j+1;
        k = k+1;
      }
      if(ob1.arr[i] == ob2.arr[j]){
        this.arr[k] = ob1.arr[i];
        i = i+1;
        j = j+1;
        k = k+1;
      }
    }
    while(i < ob1.n){
      this.arr[k] = ob1.arr[i];
      k = k+1;
      i = i+1;
    }
    while(j < ob2.n){
      this.arr[k] = ob2.arr[j];
      k = k+1;
      j = j+1;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("\nEnter size for the array: ");
    int n = sc.nextInt();
    Mixer ob1 = new Mixer(n);
    ob1.accept();
    ob1.display();

    System.out.println("\nFor Object 2: ");
    System.out.println("\nEnter size for the array: ");
    n = sc.nextInt();
    Mixer ob2 = new Mixer(n);
    ob2.accept();
    ob2.display();

    System.out.println("\nFor Object 3: ");
    Mixer ob3 = new Mixer(ob1, ob2);
    ob3.mix(ob1, ob2);
    ob3.display();
    sc.close();
  }
}