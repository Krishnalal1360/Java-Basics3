import java.util.Scanner;

public class Transarray{

  public int n, m, arr[][];

  Transarray(){
    this.n = 0;
    this.m = 0;
    this.arr = new int[0][0];
  }

  Transarray(int nn, int mm){
    if(nn != mm){
      System.out.println("\nInvalid number of rows and columns!");
      System.exit(0);
    }
    this.n = nn;
    this.m = mm;
    this.arr = new int[this.n][this.m];
  }

  public void fillarray(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter elements for the array.");
    for(int i=0;i<this.arr.length;i++){
      for(int j=0;j<this.arr[i].length;j++){
        System.out.print("Enter element at location arr["+i+"]["+j+"]: ");
        arr[i][j] = sc.nextInt();
        System.out.println();
      }
    }
  }

  public void disparray(){
    System.out.println("\nMatrix: ");
    for(int i=0;i<this.arr.length;i++){
      for(int j=0;j<this.arr[i].length;j++){
        System.out.print(this.arr[i][j]+"\t");
      }
      System.out.println();
    }
  }

  public void transpose(Transarray ob){
    System.out.println("\nTranspose of the matrix: ");
    for(int i=0;i<ob.arr.length;i++){
      for(int j=0;j<ob.arr[i].length;j++){
        System.out.print(ob.arr[j][i]+"\t");
      }
      System.out.println();
    }
  }

  public static void main(String[] args){
    int n=0, m=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows must be equal to number of columns.");
    System.out.println("\nFor object 1: ");
    System.out.println("\nEnter number of rows: ");
    n = sc.nextInt();
    System.out.println("\nEnter number of columns: ");
    m = sc.nextInt();
    Transarray ob1 = new Transarray(n, m);
    ob1.fillarray();
    ob1.disparray();
    ob1.transpose(ob1);

    System.out.println("\nFor object 2: ");
    System.out.println("\nEnter number of rows: ");
    n = sc.nextInt();
    System.out.println("\nEnter number of columns: ");
    m = sc.nextInt();
    Transarray ob2 = new Transarray(n, m);
    ob2.fillarray();
    ob2.disparray();
    ob2.transpose(ob2);
    sc.close();
  }
}