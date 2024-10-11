package abstraction;

public class LearnInnerClass {


  class Toy  {
    int price;
  }

  static class Playstation{
    int price;
  }


  public static void main(String[] args) {
    LearnInnerClass learnInnerClass=new LearnInnerClass();
    Toy toy=learnInnerClass.new Toy();
    toy.price=4;

    // Playstation playstation=new LearnInnerClass().Playstation();
  }
}
