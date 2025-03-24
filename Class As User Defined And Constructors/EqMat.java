import java.util.Scanner;

public class EqMat{

  public int n, m, a[][];

  EqMat(int nn, int mm){
    this.n = nn;
    this.m = mm;
    this.a = new int[this.n][this.m];
  }

  public void readarray(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter elements for the matrix.");
    for(int i=0;i<this.a.length;i++){
      for(int j=0;j<this.a[i].length;j++){
        System.out.print("Enter element at location a["+i+"]["+j+"]: ");
        this.a[i][j] = sc.nextInt();
        System.out.println();
      }
    }
  }

  public void print(){
    System.out.println("\nThe matrix is: ");
    for(int i=0;i<this.a.length;i++){
      for(int j=0;j<this.a[i].length;j++){
        System.out.print(this.a[i][j]+"\t");
      }
      System.out.println();
    }
  }

  public int check(EqMat ob1, EqMat ob2){
    int flag=0;
    if(ob1.n != ob2.n || ob1.m != ob2.m){
      return 0;
    }else{
      outer:
      for(int i=0;i<ob1.a.length;i++){
        for(int j=0;j<ob1.a[i].length;j++){
          if(ob1.a[i][j] != ob2.a[i][j]){
            flag = 0;
            break outer;
          }else{
            flag = 1;
            continue;
          }
        }
      }
      return flag;
    }
  }

  public static void main(String[] args){
    int n=0, m=0, flag=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: For equality of two matrices is that they must be exactly equal in terms of number of rows, number of columns and also elements.");
    System.out.println("\nFor Object 1: ");
    System.out.println("\nEnter number of rows: ");
    n = sc.nextInt();
    System.out.println("\nEnter number of columns: ");
    m = sc.nextInt();
    EqMat ob1 = new EqMat(n, m);
    ob1.readarray();  
    ob1.print();

    System.out.println("\nFor Object 2: ");
    System.out.println("\nEnter number of rows: ");
    n = sc.nextInt();
    System.out.println("\nEnter number of columns: ");
    m = sc.nextInt();
    EqMat ob2 = new EqMat(n, m);
    ob2.readarray();  
    ob2.print();

    flag = ob2.check(ob1, ob2);
    if(flag == 1){
      System.out.println("\nThe matrices are equal.");
    }else{
      System.out.println("\nThe matrices are not equal.");
    }
    sc.close();
  }
}
