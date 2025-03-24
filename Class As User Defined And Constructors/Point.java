import java.util.Scanner;

public class Point{

  public int x, y;

  Point(){
    this.x = 0;
    this.y = 0;
  }

  public void readpoint(int x, int y){
    this.x = x;
    this.y = y;
  }

  public void displaypoint(){
    System.out.println("\nCoordinates (x, y) value: "+"("+this.x+", "+this.y+")");
  }

  public float[] midpoint(Point ob1, Point ob2){
    float x=0.0f, y=0.0f, ar[];
    ar = new float[2];
    x = (ob1.x+ob2.x)/2.0f;
    y = (ob1.y+ob2.y)/2.0f;
    ar[0] = x;
    ar[1] = y;
    return ar;
  }

  public static void main(String[] args){
    int x=0, y=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The value of (x, y) can be positive or negative or both.");
    System.out.println("\nFor Object 1: ");
    System.out.println("\nEnter abscissa(x) value: ");
    x = sc.nextInt();
    System.out.println("\nEnter ordinate(y) value: ");
    y = sc.nextInt();
    Point ob1 = new Point();
    ob1.readpoint(x, y);
    ob1.displaypoint();

    System.out.println("\nFor Object 2: ");
    System.out.println("\nEnter abscissa(x) value: ");
    x = sc.nextInt();
    System.out.println("\nEnter ordinate(y) value: ");
    y = sc.nextInt();
    Point ob2 = new Point();
    ob2.readpoint(x, y);
    ob2.displaypoint();

    float ar[] = new float[2];

    ar = ob2.midpoint(ob1, ob2);

    System.out.println("\nMidpoint coordinate values: ("+ar[0]+", "+ar[1]+")");
  }
}
