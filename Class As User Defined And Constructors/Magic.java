import java.util.Scanner;

public class Magic{

  static public int magic(int n){
    int r=0, s=0;
    if((n > 0) && (n < 10)){
      return n;
    }else{
      while(n > 0){
        r = n%10;
        s = s+r;
        n = n/10;
      }
      return magic(s);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number must be greater than 0.");
    System.out.println("\nEnter a number: ");
    int n = sc.nextInt();
    System.out.println("\nNumber: "+n);

    int flag = magic(n);

    if(flag == 1){
      System.out.println("\nNumber "+n+" is Magic!");
    }else{
      System.out.println("\nNumber "+n+" is not Magic!");
    }
    sc.close();
  }
}
