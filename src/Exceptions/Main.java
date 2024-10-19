package Exceptions;

public class Main {
  public static void main(String[] args) {
    try{
    int a[]=new int [5];

    System.out.println(a[8]); 
  }catch(Exception e){
    System.out.println("Hello guys");
  }
}
}
