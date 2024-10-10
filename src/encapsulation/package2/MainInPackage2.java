package encapsulation.package2;

import encapsulation.learnPackage.Teacher;

public class MainInPackage2 extends Teacher{

  public static void main(String[] args) {
    Teacher teacher=new Teacher();
    teacher.teachingClass=12;


    MainInPackage2 m=new MainInPackage2();
    m.studentCount=44;
  }

}
