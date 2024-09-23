package methods;

public class Average {
  
  public static void main(String[] args) {
    average(4, 6);
    System.out.println("----------------");
    average(8, 6);
  }

  public static void average(int a,int b) {
    int avg=(a+b)/2;
    System.out.println(avg);
  }

}
