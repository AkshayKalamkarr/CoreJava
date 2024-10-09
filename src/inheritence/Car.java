package inheritence;

public class Car extends Vehicle {
  public static void main(String[] args) {
    Car car=new Car();
    car.wheelsCount=4;
    car.start();
  }
}
