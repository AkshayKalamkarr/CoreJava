package oops;

public class Methodoverloading {
///// Method overloading = methods have same name but different parameters.
public static void main(String[] args) {  
  Greet greet=new Greet();
  greet.greetings();
  greet.greetings("Akshay");
  greet.greetings(5);
  greet.greetings("herambh ",8);
}
}


class Greet{
  void greetings(){
    System.out.println("Hello good morning");
  }


  void greetings(int min){
    System.out.println(min+" min remaining for morning");
  }

  void greetings(String name){
    System.out.println(name+" Hello GOod Morning ");
  }

  void greetings(String name,int min){
    System.out.println("hello "+name+" "+min+" remaining for morning");
  }



}







