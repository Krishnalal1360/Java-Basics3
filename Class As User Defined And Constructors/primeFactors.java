import java.util.Scanner;

public class primeFactors{

  public int ar[], n, arr[][], index;

  primeFactors(int n){
    this.n = n;
    this.ar = new int[n];
    this.arr = new int[n][1000];
  }

  public void input(int n, int m){
    index=0;
    for(int i=n;i<=m;i++){
      ar[index] = i;
      index = index+1;
    }
    index=0;
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
    System.out.println("\nNote: The lower limit must be greater than 1.");
    System.out.println("\nEnter the lower limit: ");
    int n = sc.nextInt();
    if(n <= 1){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    System.out.println("\nEnter the upper limit: ");
    int m = sc.nextInt();
    
    primeFactors ob1 = new primeFactors((m-n)+1);
    ob1.input(n, m);
    ob1.display();
    ob1.primeFact();
    System.out.println("\nPrime Factors between "+n+" and "+m+" are: ");
    ob1.output();
    sc.close();
  }
}