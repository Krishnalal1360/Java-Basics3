import java.util.Scanner;
import java.lang.Integer;

public class Prime{

  public int n, m, arr[][];

  Prime(){
    this.n = 0;
    this.m = 0;
    this.arr = new int[n][m];
  }

  public void fill(int n, int m){
    this.n = n;
    this.m = m;
    this.arr = new int[n][m];
    int flag=0, index1=0, index2=0;
    outer:
    for(int i=2;i<=Integer.MAX_VALUE;i++){
      flag = isPrime(i);
      if(flag == 1){
        arr[index1][index2] = i;
        index2 = index2+1;
        if(index2 == m){
          index1 = index1+1;
          index2 = 0;
          if(index1 == n){
            break outer;
          }
        }
      }
    }
  }

  public int isPrime(int n){
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

  public void display(){
    System.out.println("\nMatrix: ");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]+"\t");
      }
      System.out.println();
    }
  }


  public static void main(String[] args){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor object 1: ");
    Prime ob1 = new Prime();
    System.out.println("\nEnter number of rows: ");
    int n = sc.nextInt();
    System.out.println("\nEnter number of columns: ");
    int m = sc.nextInt();
    ob1.fill(n, m);
    ob1.display();
  }
}