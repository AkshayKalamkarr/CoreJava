package string;

// import java.util.Scanner;

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

// Scanner sc= new Scanner(System.in);
// System.out.println("Enter your first name");
// String firstname=sc.nextLine();

// System.out.println("Enter your last name");
// String lastName=sc.nextLine();


// System.out.println("your full name is "+firstname+" "+lastName);

String name="Akshay23";
// toUpperCase

System.out.println(name.toUpperCase());
//toLowerCase

System.out.println(name.toLowerCase());
//trim = use to remove spaces from the strings

System.out.println(name.trim());
//StartsWith

System.out.println("Akshay".startsWith("Ak"));
//EndsWith

System.out.println("Akshay".endsWith("ay"));

// charAT
System.out.println("Akshay".charAt(4));


// valueOF
int age=123;
String stringAge=String.valueOf(age);
System.out.println(age+2);
System.out.println(stringAge+2);


// replace
String sentence="all program work properly in program";
String newSentence=sentence.replace("program", "java");
System.out.println(sentence);
System.out.println(newSentence);


// contains
String sen="hello world";
System.out.println(sen.contains("wor"));


// subString
String str="program work properly";
String substr=str.substring(2,5);
System.out.println(substr);


/// split
String para="hello world";
String words[] = para.split("");
for (String word : words) {
  System.out.println(word);
}

// toCharArray
String color="red";
char letter[]=color.toCharArray();
for (char c : letter) {
  System.out.println(c);
}


// isEmpty

String animal="";
if (animal.isEmpty()) {
  System.out.println("your string is empty");
}else{
  System.out.println("string is not empty");
}


}



}
