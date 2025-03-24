public class Series{

  public static int n=1, m=10;

  public void series(){
    if(n <= m){
      System.out.print(n+" ");
      n = n+1;
      series();
    }
  }

  public static void main(String[] args){
    Series ob = new Series(); 
    ob.series();
  }
}