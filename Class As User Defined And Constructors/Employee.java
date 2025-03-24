import java.util.Scanner;

public class Employee{

  public String n;
  public int c, flag;
  public double s, ts, hra, da, sa;

  Employee(String n, int c, double s){
    this.n = n;
    this.c = c;
    this.s = s;
  }

  public void salaryCal(){
    hra = 0.30*s;
    da = 0.40*s;
    ts = s+hra+da;
    sa = 0.20*ts;
    if((sa <= 2500) && (c <= 15) && (s <= 15000)){
      flag = 1;
      ts = ts+sa;
    }else{
      flag = 0;
      sa = 1000.0;
      ts = ts+sa;
    }
  }

  public void display(){
    System.out.println("\nName: "+n);
    System.out.println("Employee code: "+c);
    System.out.println("Basic salary: Rs."+s);
    System.out.println("House Rent Allowance: Rs."+hra);
    System.out.println("Dearness Allowance: Rs."+da);
    if(flag == 1){
      System.out.println("Special Allowance: Rs."+sa);
    }else{
      System.out.println("Special Allowance: Rs."+sa);
    }
    System.out.println("Total salary: Rs."+ts);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Employee 1: ");
    System.out.println("Enter name: ");
    String name = sc.nextLine();
    System.out.println("Enter employee code: ");
    int code = sc.nextInt();
    System.out.println("Enter basic salary: ");
    double salary = sc.nextFloat();
    Employee ob1 = new Employee(name, code, salary);
    ob1.salaryCal();
    ob1.display();
    sc.close();
  }
}