import java.util.Scanner;

public class MatrixOP{

  public int arr[][], n, m;

  public MatrixOP(){
    this.n = 0;
    this.m = 0;
    this.arr = new int[n][m];
  }

  public void get(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows must be equal to number of columns.");
    System.out.println("\nEnter number of rows: ");
    n = sc.nextInt();
    System.out.println("Enter number of columns: ");
    m = sc.nextInt();
    if((n != m) || (n <= 1) || (m <= 1)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    arr = new int[n][m];

    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        arr[i][j] = ((i*i)+(j*j));
      }
    }
  }

  public void show(){
    System.out.println("\nMatrix: ");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]+"\t");
      }
      System.out.println();
    }
  }

  public void cal(){
    int lds_prime=0, nbs=0, flag=0;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        if(i == j){
          flag = prime(arr[i][j]);
          if(flag == 1){
            lds_prime = lds_prime+arr[i][j];
          }else{
            continue;
          }
        }
      }
    }
    System.out.println("\nSum of prime left diagonal elements: "+lds_prime);
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        if((i == 0) || (j == 0) || (i == arr.length-1) || (j == arr.length-1)){
          continue;
        }else{
          nbs = nbs+arr[i][j];
        }
      }
    }
    System.out.println("\nSum of non-boundary elements: "+nbs);
  }

  public int prime(int n){
    if(n < 2){
      return 0;
    }
    int flag=0;
    for(int i=2;i<=n/2;i++){
      if(n%i == 0){
        flag = 1;
        break;
      }
    }
    if(flag == 0){
      return 1;
    }else{
      return 0;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor object 1: ");
    MatrixOP ob1 = new MatrixOP();
    ob1.get();
    ob1.show();
    ob1.cal();

    System.out.println("\nFor object 2: ");
    MatrixOP ob2 = new MatrixOP();
    ob2.get();
    ob2.show();
    ob2.cal();

    System.out.println("\nFor object 3: ");
    MatrixOP ob3 = new MatrixOP();
    ob3.get();
    ob3.show();
    ob3.cal();
    sc.close();
  }
}