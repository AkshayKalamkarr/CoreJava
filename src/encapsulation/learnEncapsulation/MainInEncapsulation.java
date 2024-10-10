package encapsulation.learnEncapsulation;

import encapsulation.learnPackage.Person;

public class MainInEncapsulation {
  public static void main(String[] args) {
    Person person1=new Person();
    person1.setAge(32);


    System.out.println(person1.getAge());
  }
}
