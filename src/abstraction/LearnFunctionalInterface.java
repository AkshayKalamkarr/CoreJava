package abstraction;

public class LearnFunctionalInterface {
  // SuperInterface superInterface=new SuperInterface() {
  //   @Override
  //   public void interfaceMethod(){

  //   }
  // };


  // SuperInterface obj2=()->{

  // };


  Walkable walkable=(int steps)->{
    System.out.println("Walked "+steps+" steps");
    return steps;
  };

  




}



@FunctionalInterface
interface SuperInterface{
  void  interfaceMethod ();
}


interface Walkable {
  int walks(int steps);
}