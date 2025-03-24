public class Add{

  public int a, b;
  static public int c;

  public void add(){
    c = a+b;
  }

  public void display(){
    System.out.println("a="+a);
    System.out.println("b="+b);
    System.out.println("c="+c);
  }

  Add(){
    this.a = 10;
    this.b = 20;
    //add();
    //display();
  }

  public static void main(String[] args) {
    Add ob1 = new Add();
    ob1.add();
    ob1.display();
  }
}