import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;
import java.lang.Integer;

public class Emirp_Number{

  static public boolean isPrime(int n){
    if(n < 2){
      return false;
    }else{
      for(int i=2;i<=n/2;i++){
        if(n%i == 0){
          return false;
        }else{
          continue;
        }
      }
      return true;
    }
  }

  static public int reverse(int n){
    String st = String.valueOf(n);
    StringBuffer sb = new StringBuffer(st);
    st = sb.reverse().toString();
    int m = Integer.parseInt(st);
    return m;
  }

  static public boolean isEmirp(int n){
    int m = reverse(n);
    boolean f1 = isPrime(n);
    boolean f2 = isPrime(m);
    if(f1 == true && f2 == true){
      return true;
    }else{
      return false;
    }
  }

  public static void main(String[] args){
    /*int n=0, m=0;
    boolean flag1 = false, flag2 = false;
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    flag1 = isPrime(n);
    m = reverse(n);
    flag2 = isPrime(m);
    if(flag1 == true && flag2 == true){
      System.out.println("Number "+n+" is Emirp!");
    }else{
      System.out.println("Number "+n+" is not Emirp!");
    }
    sc.close();*/
    int n=0, m=0, freq=0;
    boolean f=false;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the lower limit: ");
    n = sc.nextInt();
    System.out.println("Enter the upper limit: ");
    m = sc.nextInt();
    System.out.println("Emirp Numbers between "+n+" and "+m+" are: ");
    for(int i=n;i<=m;i++){
      f = isEmirp(i);
      if(f == true){
        System.out.println("Number "+i+" is Emirp!");
        freq = freq+1;
      }else{
        continue;
      }
    }
    System.out.println("Frequency of Emirp numbers is: "+freq);
    sc.close();
  }
}