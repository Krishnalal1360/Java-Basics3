import java.util.Scanner;

public class Special_Number{

  static public int sum(int n){
    int r=0, s=0;
    while(n > 0){
      r = n%10;
      s = s+fact(r);
      n = n/10;
    }
    return s;
  }

  static public int fact(int n){
    int f=1;
    for(int i=2;i<=n;i++){
      f = f*i;
    }
    return f;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The lower limit must be greater than 0.");
    System.out.println("Enter the lower limit: ");
    int n = sc.nextInt();
    System.out.println("Enter the upper limit: ");
    int m = sc.nextInt();
    if(n <= 0){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    System.out.println("\nThe special numbers between "+n+" and "+m+" are: ");
    int n1=0;
    for(int i=n;i<=m;i++){
      n1 = sum(i);
      if(i == n1){
        System.out.println(i);
      }else{
        continue;
      }
    }
    sc.close();
  }
}