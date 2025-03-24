import java.util.Scanner;

public class Combine{

  public int size, com[];

  Combine(){
    this.size = 0;
    this.com = new int[this.size];
  }

  Combine(int nn){
    this.size = nn;
    this.com = new int[this.size];
  }

  public void inputarray(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the elements for the array.");
    for(int i=0;i<this.size;i++){
      System.out.print("Enter element at location arr["+i+"]: ");
      this.com[i] = sc.nextInt();
      System.out.println();
    }
  }

  public void display(){
    System.out.println("\nArray: ");
    for(int i=0;i<this.size;i++){
      System.out.println("arr["+i+"]="+this.com[i]);
    }
  }

  public void mix(Combine ob1, Combine ob2){
    this.size = ob1.size+ob2.size;
    this.com = new int[this.size];
    int index=0;
    for(int i=0;i<ob1.size;i++){
      this.com[index] = ob1.com[i];
      index = index+1;
    }
    for(int i=0;i<ob2.size;i++){
      this.com[index] = ob2.com[i];
      index = index+1;
    }
  }

  public void sort(){
    int min=0, temp=0;
    for(int i=0;i<this.size-1;i++){
      min = i;
      for(int j=i+1;j<this.size;j++){
        if(this.com[j] < this.com[min]){
          min = j;
        }
      }
      temp = this.com[i];
      this.com[i] = this.com[min];
      this.com[min] = temp;
    }
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("\nEnter size for the array: ");
    n = sc.nextInt();
    Combine ob1 = new Combine(n);
    ob1.inputarray();
    ob1.display();

    System.out.println("\nFor Object 2: ");
    System.out.println("\nEnter size for the array: ");
    n = sc.nextInt();
    Combine ob2 = new Combine(n);
    ob2.inputarray();
    ob2.display();

    Combine ob3 = new Combine();
    ob3.mix(ob1, ob2);
    ob3.display();
    ob3.sort();
    ob3.display();
    sc.close();
  }
}