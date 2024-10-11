package abstraction;

public class LearnInterfaces {
  public static void main(String[] args) {
    Monkey monkey=new Monkey();
    monkey.eats();
  }

}


interface Pet{
  void signs();
}





interface Animal{
  void eats();

}

class Monkey implements Animal,Pet{
  public void eats(){
    System.out.println("monkey is eating");
  }

  public void signs(){
    System.out.println("monkey is singing");
  }
}