package assignmentTwo.aggregation;

import java.util.ArrayList;
import java.util.List;

class Student {
     private String name;
     private int rollNo;

     public Student(String name, int rollNo) {
          this.name = name;
          this.rollNo = rollNo;
     }

     public void displayStudentInfo(){
          System.out.println("Student Name : "+ name + "\nRoll No: "+ rollNo);
     }
}
 class University {
      private List<Student> studentsList;


      public University(){
           studentsList = new ArrayList<>();
      }
       public void addStudent(Student student){
           studentsList.add(student);
       }
       public void displayStudents(){
           if(studentsList.isEmpty()){
                System.out.println(" There is no student in the university");
           }
            else{
                for (Student student1: studentsList) {
                     student1.displayStudentInfo();

                }
           }
       }

 }
  public class UniversityManagement{
      public static void main(String[] args) {
          University university = new University();

          Student student1 = new Student("pratik",101);
          Student student2 = new Student("dev", 102);
          university.addStudent(student1);
          university.addStudent(student2);
          university.displayStudents();

          // University removed, but student still exist
          university = null;
          System.out.println("Student details after deletion of university");
          student1.displayStudentInfo();
          student2.displayStudentInfo();
      }
  }
