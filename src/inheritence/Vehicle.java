package inheritence;

public class Vehicle {
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
}



