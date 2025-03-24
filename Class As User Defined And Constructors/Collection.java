import java.util.Scanner;

public class Collection{

  public int arr[], len;

  Collection(){
    this.arr = new int[0];
    this.len = 0;
  }

  Collection(int n){
    this.arr = new int[n];
    this.len = this.arr.length;
  }

  public void inparr(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter elements for the array.");
    for(int i=0;i<arr.length;i++){
      System.out.print("Enter element at location arr["+i+"]: ");
      arr[i] = sc.nextInt();
      System.out.println();
    }
  }

  public void arrange(){
    int temp=0;
    for(int i=0;i<arr.length-1;i++){
      temp = arr[i];
      for(int j=i+1;j<arr.length;j++){
        if(arr[j] < arr[i]){
          arr[i] = arr[j];
          arr[j] = temp;
          temp = arr[i];
        }
      }
    }
  }

  public void display(){
    System.out.println("\nArray: ");
    for(int i=0;i<arr.length;i++){
      System.out.println("arr["+i+"]="+arr[i]);
    }
  }

  public int[] common(Collection ob1, Collection ob2, int ar[]){
    int index=0;
    for(int i=0;i<ob1.len;i++){
      for(int j=0;j<ob2.len;j++){
        if(ob1.arr[i] == ob2.arr[j]){
          ar[index] = ob1.arr[i];
          index = index+1;
        }
      }
    }
    return ar;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor object 1: ");
    System.out.println("\nEnter size for the array: ");
    int n = sc.nextInt();
    Collection ob1 = new Collection(n);
    ob1.inparr();
    ob1.arrange();
    ob1.display();

    System.out.println("\nFor object 2: ");
    System.out.println("\nEnter size for the array: ");
    int m = sc.nextInt();
    Collection ob2 = new Collection(m);
    ob2.inparr();
    ob2.arrange();
    ob2.display();

    int ar[];
    if(n < m){
      ar = new int[n]; 
    }else if(m < n){
      ar = new int[m];
    }else{
      ar = new int[n];
    }

    ar = ob2.common(ob1, ob2, ar);

    System.out.println("\nCommon elements: ");
    for(int i=0;i<ar.length;i++){
      if(ar[0] == 0){
        System.out.println("No common elements found!");
        break;
      }
      if(ar[i] == 0){
        break;
      }
      System.out.println("ar["+i+"]="+ar[i]);
    }
    sc.close();
  }
}