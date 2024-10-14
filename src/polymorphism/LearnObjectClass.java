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

///// override equals method
  @Override
  public boolean equals(Object obj){
    Car that=(Car)obj;
    return (this.model.equals(that.model) && this.year == that.year) ? true : false;
  }

  // @Override
  // public int hashcode(){
  //   int initialNumber=31;
  //   initialNumber+=year;
  //   initialNumber+=model.hashCode();
  //   return initialNumber;
  // }







}

public class LearnObjectClass {
  public static void main(String[] args) {
    Car obj1=new Car("honda",2022 );
    Car obj2=new Car("honda",2022 );

    System.out.println(obj1.equals(obj2));
    System.out.println(obj1 == obj2);
    System.out.println(obj1.hashCode());
    System.out.println(obj2.hashCode());  
  }
  
}
