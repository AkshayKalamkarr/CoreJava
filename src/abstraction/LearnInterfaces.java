package abstraction;

public class LearnInterfaces {
  public static void main(String[] args) {
    Monkey monkey=new Monkey();
    monkey.eats();
    monkey.drinks();
    System.out.println(Animal.Legs);
  }

}


interface Pet{
  void signs();

  void drinks();
}





interface Animal{
  public static final int Legs=4;


  void eats();

  void drinks();

  default void walk(){                 ///////// through this we can changes in all the classes which implements interfaces
     System.out.println("Animal is Walking");
  }

}

class Monkey implements Animal,Pet{
  public void eats(){
    System.out.println("monkey is eating");
  }

  public void signs(){
    System.out.println("monkey is singing");
  }

  public void drinks(){
    System.out.println("monkey is drinking");
  }
}