package methods;

public class LearnMath {
 
  public static void main(String[] args) {

    // int a=3;
    // int b=4;
    // System.out.println(Math.pow(a, b));
    System.out.println(getRandom(10,20));
  }


  public static int getRandom(int a,int b){
    return (int) (Math.random()*(b-a+1)+a);
  }
  
}
