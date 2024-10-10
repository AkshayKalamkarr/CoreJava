package encapsulation.learnPackage;

public class Person {

  private int age;

  private String name;


  boolean canBeChanged=false;


  public void setAge(int age){
    if (canBeChanged) {
      this.age=age;
    }

  }

  public int getAge (){
    return age;
  }

}
