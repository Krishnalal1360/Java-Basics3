public class Add_Sub {

  class Add{
    public int a, b, c;

    Add(){
      this.a = 10;
      this.b = 5;
    }

    public void add(){
      c = a+b;
    }

    public void display(){
      System.out.println("\nAddition");
      System.out.println("a="+a);
      System.out.println("b="+b);
      System.out.println("c="+c);
    }
  }

  Add ob1 = new Add();

  class Sub{
    public int a, b, c;

    Sub(){
      this.a = 10;
      this.b = 5;
    }

    public void sub(){
      c = a-b;
    }

    public void display(){
      System.out.println("\nSubtraction");
      System.out.println("a="+a);
      System.out.println("b="+b);
      System.out.println("c="+c);
    }
  }

  Sub ob2 = new Sub();

  public static void main(String[] args) {
    Add_Sub ob = new Add_Sub();
    ob.ob1.add();
    ob.ob1.display();
    ob.ob2.sub();
    ob.ob2.display();
  }
}