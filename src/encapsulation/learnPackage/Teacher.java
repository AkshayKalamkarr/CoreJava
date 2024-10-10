package encapsulation.learnPackage;

public class Teacher {
public int teachingClass;

private int id;

String degree;  /// deafult or package private 


protected int studentCount;


public static void main(String[] args) {
  Teacher teacher=new Teacher();
  teacher.id=13;
}

}
