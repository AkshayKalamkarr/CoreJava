package oops;

public class Constructors {
public static void main(String[] args) {
  // Complex num1=new Complex();
  // Complex num2=new Complex();
  // num1.print();
  // num2.print();


  Complex complex=new Complex(2, 3); 
  complex.print();

  Complex complex2=new Complex(1);
  complex2.print();

  Complex result=complex.add(complex2);
  result.print();

}
}



class Complex{
  int a,b;

  // public Complex(){
  //    a=5;
  //    b=9;
  // }


  public Complex(int real,int imaginary){
    a=real;
    b=imaginary;
  }

  public Complex(int real){
    a=real;
    b=12;
  }

  Complex add(Complex num2){
    return new Complex(a+num2.a,b+num2.b);
     
  }


  void print(){
    System.out.println(a+" + "+b );
  }
}
