package encapsulation.learnEncapsulation;

import encapsulation.learnPackage.Person;

public class MainInEncapsulation {

  // public static void printHello(){
  //   System.out.println("Hello");
  // }


  // public void printhi(){
  //   System.out.println("hi");
  // }








  public static void main(String[] args) {
    // MainInEncapsulation.printHello();
    // Person person1=new Person();
    // person1.setAge(32);


    // System.out.println(person1.getAge());
    // System.out.println(person1.count);


    Person person1 =new Person();
    person1.setAge(2);

    Person person2=new Person();

    Person person3=new Person();
    System.out.println(Person.count);



    // MainInEncapsulation mainInEncapsulation=new MainInEncapsulation();
    // mainInEncapsulation.printhi();
  }
}
