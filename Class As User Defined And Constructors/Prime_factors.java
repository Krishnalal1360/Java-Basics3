import java.util.Scanner;

public class Prime_factors {

  public int ar[], n, arr[][], index;

  Prime_factors(int n){
    this.n = n;
    this.ar = new int[n];
    this.arr = new int[n][1000];
  }

  public void input(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The element must be greater than 1.");
    System.out.println("\nEnter elements of the array: ");
    for(int i=0;i<ar.length;i++){
      System.out.print("Enter element at location ar["+i+"]: ");
      ar[i] = sc.nextInt();
      if(ar[i] <= 1){
        System.out.println("\nInvalid Input!");
        System.exit(0);
      }
      System.out.println();
    }
  }

  public void display(){
    System.out.println("\nArray: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
  }

  public void primeFact(){
    int num=0, flag=0;
    for(int i=0;i<ar.length;i++){
      num = ar[i];
      index = 0;
      for(int j=2;j<=num;j++){
        flag = 0;
        inner: 
        for(int k=2;k<=j/2;k++){
          if(j%k == 0){
            flag = 1;
            break inner;
          }
        }
        if(flag == 0){
          prime(i, j, num);
        }else{
          continue;
        }
      }
    }
  }

  public void prime(int i, int j, int num){
    int count=0;
    while(num > 0){
      if(num%j == 0){
        count = count+1;
        num = num/j;
      }else{
        break;
      }
    }
    for(int k=1;k<=count;k++){
      arr[i][index] = j;
      index = index+1;
    }
  }

  public void output(){
    for(int i=0;i<arr.length;i++){
      System.out.println("Prime factors of "+ar[i]+" are: ");
      for(int j=0;j<arr[i].length;j++){
        if(arr[i][j] == 0){
          break;
        }else{
          System.out.println(arr[i][j]);
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The limit for the size is 200.");
    System.out.println("\nEnter size for the array: ");
    int n = sc.nextInt();
    if(n > 200){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    Prime_factors ob1 = new Prime_factors(n);
    ob1.input();
    ob1.display();
    ob1.primeFact();
    ob1.output();
    sc.close();
  }
}