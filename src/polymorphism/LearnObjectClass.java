package polymorphism;



class Car{
  String model;
  int year;

  public Car(String model,int year){
    this.model=model;
    this.year=year;
  }

  // @Override
  // public String toString(){
  //   return "Car model is "+model+" and year is "+year;
  // }


  public boolean equals(Object obj){
    Car that=(Car)obj;
    return (this.model.equals(that.model) && this.year == that.year) ? true : false;
  }
}

public class LearnObjectClass {
  public static void main(String[] args) {
    Car obj1=new Car("honda",2022 );
    Car obj2=new Car("honda",2022 );

    System.out.println(obj1.equals(obj2));
    System.out.println(obj1 == obj2);
    System.out.println(obj1);
    System.out.println(obj2);  
  }
  
}
