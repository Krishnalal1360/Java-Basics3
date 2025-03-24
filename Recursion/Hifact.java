import java.util.Scanner;

public class Hifact{

  public int a, b, hcf, lcm;

  Hifact(){
    this.a = 0;
    this.b = 0;
    this.hcf = 0;
    this.lcm = 0;
  }

  public void getdata(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value for a: ");
    this.a = sc.nextInt();
    System.out.println("Enter the value for b: ");
    this.b = sc.nextInt();
  }

  public void swap(){
    int temp;
    if(this.b > this.a){
      temp = this.a;
      this.a = this.b;
      this.b = temp;
    }
  }

  public void hcf_lcm(){
    this.hcf = hcf(this.a, this.b);
  }

  public int hcf(int a, int b){
    if(a == b){
      return a;
    }else{
      if(a > b){
        return hcf(a-b, b);
      }else{
        return hcf(a, b-a);
      }
    }
  }

  public void result(){
    System.out.println("a value: "+this.a);
    System.out.println("b value: "+this.b);
    System.out.println("H.C.F: "+this.hcf);
    this.lcm = (this.a*this.b)/this.hcf;
    System.out.println("L.C.M: "+this.lcm);
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Hifact ob1 = new Hifact();
    ob1.getdata();
    ob1.swap();
    ob1.hcf_lcm();
    ob1.result();

    System.out.println("\nFor Object 2: ");
    Hifact ob2 = new Hifact();
    ob2.getdata();
    ob2.swap();
    ob2.hcf_lcm();
    ob2.result();
  }
}