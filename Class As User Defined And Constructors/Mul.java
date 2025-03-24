import java.util.Scanner;

public class Mul{

  public int a, b, c;

  Mul(int a, int b){
    this.a = a;
    this.b = b;
  }

  Mul(Mul ob){
    this.a = ob.a;
    this.b = ob.b;
  }

  Mul(Mul ob1, Mul ob2){
    this.a = ob1.a+ob2.a;
    this.b = ob1.b+ob2.b;
  }

  public void mul(){
    c = a*b;
  }

  public void display(){
    System.out.println("\nMultiplication");
    System.out.println("a="+a);
    System.out.println("b="+b);
    System.out.println("c="+c);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nObject ob1");
    System.out.println("Enter value of a: ");
    int a = sc.nextInt();
    System.out.println("Enter value of b: ");
    int b = sc.nextInt();
    Mul ob1 = new Mul(a, b);
    ob1.mul();
    ob1.display();

    System.out.println("\nObject ob2");
    System.out.println("Enter value of a: ");
    a = sc.nextInt();
    System.out.println("Enter value of b: ");
    b = sc.nextInt();
    Mul ob2 = new Mul(a, b);
    ob2.mul();
    ob2.display();

    System.out.println("\nObject ob3 copying contents of ob1");
    Mul ob3 = new Mul(ob1);
    ob3.mul();
    ob3.display();

    System.out.println("\nObject ob4 copying contents of ob1 and ob2");
    Mul ob4 = new Mul(ob1, ob2);
    ob4.mul();
    ob4.display();
    sc.close();
  }
}