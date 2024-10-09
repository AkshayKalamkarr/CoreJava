package inheritence;

public class Vehicle {
  // final
   int gears;

  public static void main(String[] args) {
    Vehicle vehicle1=new Vehicle(2);
    vehicle1.gears=6;
  }







  int wheelsCount;

  String model="Land cruiser";


  Vehicle(){
    System.out.println("creating a vehicle instance");
  }

  Vehicle(int wheelsCount){
    this.wheelsCount=wheelsCount;
    System.out.println("creating vehicle with wheels");
  }

  void start(){
    System.out.println("vehicle is starting");
  }


  final void accelerate(){
    System.out.println("Vehicle is accelerating");
  }
}



