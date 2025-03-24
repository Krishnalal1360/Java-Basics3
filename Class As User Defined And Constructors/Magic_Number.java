import java.util.Scanner;

public class Magic_Number{

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
    System.out.println("\nNote: The lower limit must be greater than 0.");
    System.out.println("\nEnter the lower limit: ");
    int n = sc.nextInt();
    System.out.println("\nEnter the upper limit: ");
    int m = sc.nextInt();

    int freq=0;
    System.out.println("\nMagic numbers between "+n+" and "+m+" are: ");
    for(int i=n;i<=m;i++){
      int flag = magic(i);
      if(flag == 1){
        System.out.println(i);
        freq = freq+1;
      }else{
        continue;
      }
    }

    System.out.println("\nFrequency: "+freq);
    sc.close();
  }
}
