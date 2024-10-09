package inheritence;

public class Car extends Vehicle {

  void start(){
    System.out.println("car is starting");
  }





  public static void main(String[] args) {
    Car car=new Car();
    car.wheelsCount=4;
    car.start();
  }
}
