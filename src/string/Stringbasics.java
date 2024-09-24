package string;

import java.util.Scanner;

public class Stringbasics {
public static void main(String[] args) {
  // String name="Akshay";
  // String sameName="Akshay";
  // String newName=new String("Akshay");

  //// equals method use to compare two strings in java


// if (name.equals(newName)) {
//   System.out.println("name and newname have same values");
// }else{
//   System.out.println("they dont have same values");
// }


////// equalsIgnoreCase is used to remove case sensective things
// if (name.equalsIgnoreCase(newName)) {
//   System.out.println("name and newname have same values ");
// } else {
//   System.out.println("dont have same values");
// }

Scanner sc= new Scanner(System.in);
System.out.println("Enter your first name");
String firstname=sc.nextLine();

System.out.println("Enter your last name");
String lastName=sc.nextLine();


System.out.println("your full name is "+firstname+" "+lastName);






}
}
