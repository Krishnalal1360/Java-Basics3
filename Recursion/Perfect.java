import java.util.Scanner;

public class Perfect{

  public int num, sum, index;

  Perfect(int nn){
    this.num = nn;
    this.sum = 0;
    this.index = 1;
  }

  public int sum(int index){
    if(index == this.num){
      return this.sum;
    }else{
      if(this.num%index == 0){
        this.sum = this.sum+index;
      }
      index = index+1;
      return sum(index);
    }
  }

  public void check(){
    this.sum = sum(this.index);
    if(this.sum == this.num){
      System.out.println(this.num+" is Perfect!");
    }else{
      System.out.println(this.num+" is not Perfect!");
    }
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    Perfect ob1 = new Perfect(n);
    ob1.check();

    System.out.println("\nFor Object 2: ");
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    Perfect ob2 = new Perfect(n);
    ob2.check();
    sc.close();
  }
}