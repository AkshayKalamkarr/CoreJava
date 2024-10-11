package abstraction;

public class LearnAbstract {
  public static void main(String[] args) {
    // vehicle vehicle1=new vehicle();

    Car car=new Car();
    car.accelerate();
    car.brakes(2);
    car.honks();


  }
}




abstract class Vehicle{
  abstract void accelerate();

  abstract int brakes(int wheels);



  void honks(){                               /////// concrete methods
    System.out.println("vehicle honks");
  }
}



class Scooter extends Vehicle{
  void accelerate(){

  }

  int brakes(int wheels){
    return 0;
  }
}


class Car extends Vehicle{
  void accelerate(){
    System.out.println("Car is accelerating");
  }

  void accelerated(){

  }


  int brakes(int wheels){
    System.out.println("car breaks are pushed");
    return wheels;
  }


  void honks(){
    System.out.println("car is honked");
  }
}


