public class Hello{

  public static int count=0;

  public void message(){
    if(count < 5){
      System.out.println("Hello Recursion!");
      count = count+1;
      message();
    }
  }

  public static void main(String[] args){
    Hello ob = new Hello();
    ob.message();
  }
}