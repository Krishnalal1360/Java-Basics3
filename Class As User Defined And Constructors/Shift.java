import java.util.Scanner;

public class Shift{

  public int n, m, mat[][];

  Shift(int nn, int mm){
    this.n = nn;
    this.m = mm;
    this.mat = new int[n][m];
  }

  public void input(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter elements for the matrix.");
    for(int i=0;i<this.mat.length;i++){
      for(int j=0;j<this.mat[i].length;j++){
        System.out.print("Enter element at location mat["+i+"]["+j+"]: ");
        mat[i][j] = sc.nextInt();
        System.out.println();
      }
    }
  }

  public void display(){
    System.out.println("\nThe matrix is: ");
    for(int i=0;i<this.mat.length;i++){
      for(int j=0;j<this.mat[i].length;j++){
        System.out.print(this.mat[i][j]+"\t");
      }
      System.out.println();
    }
  }

  public void cyclic(Shift ob){
    int ar[] = new int[ob.m];
    int index=0;
    outer:
    for(int i=0;i<ob.mat.length;i++){
      for(int j=0;j<ob.mat[i].length;j++){
        ar[index] = ob.mat[i][j];
        index = index+1;
      }
      if(i == 0){
        break outer;
      }
    }
    for(int i=0;i<ob.mat.length-1;i++){
      for(int j=0;j<ob.mat[i].length;j++){
        ob.mat[i][j] = ob.mat[i+1][j];
      }
    }
    index=0;
    for(int i=ob.mat.length-1;i<ob.mat.length;i++){
      for(int j=0;j<ob.mat[i].length;j++){
        ob.mat[i][j] = ar[index];
        index = index+1;
      }
    }
  }

  public static void main(String[] args){
    int n=0, m=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("\nEnter number of rows: ");
    n = sc.nextInt();
    System.out.println("\nEnter number of columns: ");
    m = sc.nextInt();
    Shift ob1 = new Shift(n, m);
    ob1.input();
    ob1.display();
    ob1.cyclic(ob1);
    ob1.display();

    System.out.println("\nFor Object 2: ");
    System.out.println("\nEnter number of rows: ");
    n = sc.nextInt();
    System.out.println("\nEnter number of columns: ");
    m = sc.nextInt();
    Shift ob2 = new Shift(n, m);
    ob2.input();
    ob2.display();
    ob2.cyclic(ob2);
    ob2.display();
    sc.close();
  }
}