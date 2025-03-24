import java.util.Scanner;

public class Rearrange{

  public int n, ar[], pos1, item, pos2;

  Rearrange(){
    this.n = 0;
    this.ar = new int[n];
    this.pos1 = 0;
    this.item = 0;
    this.pos2 = 0;
  }

  public void enter(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter size for the array.");
    int n = sc.nextInt();
    ar = new int[n+1];
    System.out.println("\nEnter elements for the array.");
    for(int i=0;i<ar.length-1;i++){
      System.out.print("Enter element at location ar["+i+"]: ");
      ar[i] = sc.nextInt();
      System.out.println();
    }
  }

  public void insert(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter position to insert element.");
    pos1 = sc.nextInt();
    System.out.println("\nEnter element to insert.");
    item = sc.nextInt();
    for(int i=ar.length-1;i>pos1;i--){
      ar[i] = ar[i-1];
    }
    ar[pos1] = item;
  }

  public void disp1(){
    System.out.println("\nArray after insertion of "+item+" at index "+pos1+" is: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
  }

  public void remov(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter position to remove element.");
    pos2 = sc.nextInt();
    if(pos2 == ar.length-1){
      ar[pos2] = 0;
    }else{
      for(int i=pos2;i<ar.length-1;i++){
        ar[i] = ar[i+1];
      }
      ar[ar.length-1] = 0;
    }
  }

  public void disp2(){
    System.out.println("\nArray after removal of element at index "+pos2+" is: ");
    for(int i=0;i<ar.length-1;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
  }

  public static void main(String[] args) {
    System.out.println("\nFor object 1: ");
    Rearrange ob1 = new Rearrange();
    ob1.enter();
    ob1.insert();
    ob1.disp1();
    ob1.remov();
    ob1.disp2();
  }
}