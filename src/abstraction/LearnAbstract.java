package abstraction;

public class LearnAbstract {
  public static void main(String[] args) {
    // vehicle vehicle1=new vehicle();

    Car car=new Car();
    car.accelerate();
    car.breake(2);
    car.honks();


  }
}




abstract class Vehicle{
  abstract void accelerate();

  abstract int breake(int wheels);



  void honks(){                               /////// concrete methods
    System.out.println("vehicle honks");
  }
}


class Car extends Vehicle{
  void accelerate(){
    System.out.println("Car is accelerating");
  }

  void accelerated(){

  }


  int breake(int wheels){
    System.out.println("car breaks are pushed");
    return wheels;
  }


  void honks(){
    System.out.println("car is honked");
  }
}


