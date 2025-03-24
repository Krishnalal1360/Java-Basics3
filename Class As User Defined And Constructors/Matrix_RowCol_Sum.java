import java.util.Scanner;

public class Matrix_RowCol_Sum {

  public int n, m, ar[][];

  Matrix_RowCol_Sum(int n, int m){
    this.n = n;
    this.m = m;
    this.ar = new int[n][m];
  }

  public void input(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter elements for the matrix.");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print("Enter element at location ar["+i+"]["+j+"]: ");
        ar[i][j] = sc.nextInt();
        System.out.println();
      }
    }
  }

  public void display(){
    System.out.println("\nMatrix: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }
  }

  public void rowSum(){
    int rs=0, trs=0;
    System.out.println("\nRow Sum: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        rs = rs+ar[i][j];
      }
      System.out.println("Row "+(i+1)+" sum: "+rs);
      trs = trs+rs;
      rs = 0;
    }
    System.out.println("Total row sum: "+trs);
  }

  public void colSum(){
    int cs=0, tcs=0;
    System.out.println("\nColumn Sum: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        cs = cs+ar[j][i];
      }
      System.out.println("Column "+(i+1)+" sum: "+cs);
      tcs = tcs+cs;
      cs = 0;
    }
    System.out.println("Total column sum: "+tcs);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows must be equal to number of columns.");
    System.out.println("\nFor object 1: ");
    System.out.println("Enter number of rows: ");
    int n = sc.nextInt();
    System.out.println("Enter number of columns: ");
    int m = sc.nextInt();
    if(n != m){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    Matrix_RowCol_Sum ob1 = new Matrix_RowCol_Sum(n, m);
    ob1.input();
    ob1.display();
    ob1.rowSum();
    ob1.colSum();
    sc.close();
  }
}
