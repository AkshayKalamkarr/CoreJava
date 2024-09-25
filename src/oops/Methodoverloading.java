package oops;

public class Methodoverloading {
///// Method overloading = methods have same name but different parameters.
public static void main(String[] args) {  
  Greet greet=new Greet();
  greet.greetings();
  greet.greetings("Akshay");

}
}


class Greet{
  void greetings(){
    System.out.println("Hello good morning");
  }


  void greetings(String name){
    System.out.println(name+" Hello GOod Morning ");
  }
}





