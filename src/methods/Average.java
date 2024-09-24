package methods;

public class Average {
  
  public static void main(String[] args) {
    int avgfromfun=average(4, 6);
    int doubleavg=avgfromfun*2;
    System.out.println(doubleavg);
    System.out.println("----------------");
    // average(8, 6);
  }

  public static int average(int a,int b) {
    int avg=(a+b)/2;
    return avg;
  };


  static int minimun(int a,int b){
   return a<b ? a :b; 
  }





}
