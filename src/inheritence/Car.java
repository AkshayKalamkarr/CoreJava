package inheritence;

public class Car extends Vehicle {

  String color;

  void start(){
    Scooter scooter=new Scooter();
    scooter.braking(this);
    super.start();
    System.out.println(this);
    System.out.println(this.model+" car is starting");
  }   

  Car braking(){
    return this;
  }


  Car(){
    super(3);
    System.out.println("Car is being created");
  }




  public static void main(String[] args) {
    Car car=new Car();
    car.wheelsCount=4;
    car.color="black";
    car.start();
  }
}


class Scooter{
  void braking(Car car){
    System.out.println(car.model+" is braking");
  }
}