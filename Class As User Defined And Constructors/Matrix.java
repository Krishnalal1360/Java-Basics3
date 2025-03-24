import java.util.Scanner;

public class Matrix{

  public int n, m, ar[][];

  Matrix(int n, int m){
    this.n = n;
    this.m = m;
    this.ar = new int[n][m];
  }

  public void fillarray(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter elements for the matrix.");
    for(int i=0;i<this.n;i++){
      for(int j=0;j<this.m;j++){
        System.out.print("Enter element at location ar["+i+"]["+j+"]: ");
        ar[i][j] = sc.nextInt();
        System.out.println();
      }
    }
  }

  public void display(){
    System.out.println("\nThe matrix is: ");
    for(int i=0;i<this.n;i++){
      for(int j=0;j<this.m;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }
  }

  public void add(Matrix ob1, Matrix ob2){
    if(ob1.n != ob2.n || ob1.m != ob2.m){
      System.out.println("Invalid Input!");
      System.exit(0);
    }
    System.out.println("\nAddition of the two matrices is: ");
    for(int i=0;i<this.n;i++){
      for(int j=0;j<this.m;j++){
        this.ar[i][j] = ob1.ar[i][j]+ob2.ar[i][j];
      }
    }
  }

  public void sub(Matrix ob1, Matrix ob2){
    if(ob1.n != ob2.n || ob1.m != ob2.m){
      System.out.println("Invalid Input!");
      System.exit(0);
    }
    System.out.println("\nSubtraction of the two matrices is: ");
    for(int i=0;i<this.n;i++){
      for(int j=0;j<this.m;j++){
        this.ar[i][j] = ob1.ar[i][j]-ob2.ar[i][j];
      }
    }
  }

  public static void main(String[] args){

    int n=0, m=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows must be equal to number of columns.");
    System.out.println("Also for addition of two matrices their number of rows must be equal to number of columns.");
    System.out.println("Also for subtraction of two matrices their number of rows must be equal to number of columns.");
    System.out.println("\nFor Object 1: ");
    System.out.println("\nEnter number of rows: ");
    n = sc.nextInt();
    System.out.println("\nEnter number of columns: ");
    m = sc.nextInt();
    if(n != m){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    Matrix ob1 = new Matrix(n, m);
    ob1.fillarray();
    ob1.display();

    System.out.println("\nFor Object 2: ");
    System.out.println("\nEnter number of rows: ");
    n = sc.nextInt();
    System.out.println("\nEnter number of columns: ");
    m = sc.nextInt();
    if(n != m){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    Matrix ob2 = new Matrix(n, m);
    ob2.fillarray();
    ob2.display();

    ob2.add(ob1, ob2);
    ob2.display();

    ob2.sub(ob1, ob2);
    ob2.display();

    sc.close();
  }
}