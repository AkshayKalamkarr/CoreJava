package oops;

public class LearningClasses {
  public static void main(String[] args) {
    // Dog dog =new Dog();
    // dog.name="Tommy";
    // dog.walk();

    // Dog dog2=new Dog();
    // dog2.name="Leo";
    // dog.bark();

    Complex complex=new Complex();
    complex.a=3;
    complex.b=4;
    complex.print();




  }
  
}


// class Dog{   /// factory 
//   String name;
//   String age;
//   String color;

//   void walk(){
//     System.out.println(name+" is walking");
//   }

//   void bark(){
//     System.out.println(name+" is barking");
//   }
// }

// class Cat{
// } 


class Complex{
  int a,b;

  void print(){
    System.out.println(a+" + "+b);
  }
}


