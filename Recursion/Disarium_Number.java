import java.util.Scanner;
import java.lang.String;
import java.lang.Math;

public class Disarium_Number{

  static public int check(int n){
    int dp=0, l=0, r=0, s=0;
    String st = String.valueOf(n);
    l = st.length();
    dp = n;
    while(dp > 0){
      r = dp%10;
      s = s+(int)(Math.pow(r, l));
      l = l-1;
      dp = dp/10;
    }
    if(n == s){
      return 1;
    }else{
      return 0;
    }
  }

  static public void isDisarium(int n, int m){
    int flag=0, freq=0;
    System.out.println("\nDisarium number inclusive between "+n+" and "+m+" are: ");
    for(int i=n;i<=m;i++){
      flag = check(i);
      if(flag == 1){
        System.out.println(i+" is Disarium!");
        freq = freq+1;
      }
    }
    System.out.println("\nFrequency: "+freq);
  }

  public static void main(String[] args){
    /*int n=0, dp=0, r=0, l=0, s=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a number: ");
    n = sc.nextInt();
    String st = String.valueOf(n);
    l = st.length();
    dp = n;
    while(dp > 0){
      r = dp%10;
      s = s+(int)(Math.pow(r, l));
      l = l-1;
      dp = dp/10;
    }
    if(s == n){
      System.out.println(n+" is Disarium!");
    }else{
      System.out.println(n+" is not Disarium!");
    }
    sc.close();*/
    int n=0, m=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter lower limit: ");
    n = sc.nextInt();
    System.out.println("\nEnter upper limit: ");
    m = sc.nextInt();
    isDisarium(n, m);
    sc.close();
  }
}