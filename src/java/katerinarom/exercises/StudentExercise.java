package katerinarom.exercises;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.lang.String;

final class StudentExercise {

  public static void main(String[] args) {
    Student stud = new Student(234, "1900", "Ivanov", "Ivan", "Ivanovich", "Moscow", "915-234-5678", "Auto", "3",
        "K-35"); // passed values to the constructor and created the Student object
    //    System.out.println(stud.toString()); //invoke toString method and return a string
    Student[] students = new Student[] {
        stud,
        new Student(543, "1980", "Petrov", "Petr", "Petrovich", "Vologda", "912-345-6789", "Economy", "5", "E-53"),
        new Student(123, "1990", "Sidorov", "Sidr", "Sidorovich", "Tver", "912-678-6789", "Machine", "2", "M-22")
    }; //var type of Student[]
    //    System.out.println(students.length);
    //    System.out.println(students[0].toString()); //accepts an object of String type/ calls the String method
    //    System.out.println(students[1]);// method println calls at first String.valueOf(x) to get the printed object's string value/after String.valueOf calls obj.toString
    //    StudentExercise.printArray(students);
          System.out.println(Arrays.toString(students));//return a string representation of the array
    //    facultyStudents(students); //a)
          studentsFacultyGroup(students); //b)
    //    studentsYear(students); //c)
    //      studentsGroup(students);//d)

  }

  //a) a list of students of a given faculty;
  //  public static void facultyStudents(Student[] students) {
  //    System.out.print("Please enter the faculty and after that you will see a list of the faculty students: ");
  //    Scanner scanner = new Scanner(System.in);
  //    String enteredFaculty = scanner.next();
  //    boolean foundStudents = false;
  //    for (int i = 0; i < students.length; i++) {
  //      if (students[i].isOnFaculty(enteredFaculty)) {
  //        System.out.println(students[i]);
  //        foundStudents = true;
  //      }
  //    }
  //    if(!foundStudents) {
  //      System.out.println("There are no students for the faculty " + enteredFaculty);
  //    }
  //

  //c) a list of students born after a given year;
  //  public static void studentsYear(Student[] students) {
  //    System.out.print("Please enter the year and you will see the students who were born after the year: ");
  //    Scanner scanner = new Scanner(System.in);
  //    String enteredYear = scanner.next();
  //    boolean foundStudents = false;
  //    for (int i = 0; i < students.length; i++) {
  //      if (students[i].isThisYear(enteredYear)) {
  //        System.out.println(students[i]);
  //        foundStudents = true;
  //      }
  //    }
  //    if(!foundStudents) {
  //      System.out.println("There are no students for the year " + enteredYear);
  //    }
  //  }

  //d) list of study group;
  //  public static void studentsGroup(Student[] students) {
  //    System.out.print("Please enter the group and you will see the students who are included in the group: ");
  //    Scanner scanner = new Scanner(System.in);
  //    String enteredGroup= scanner.next();
  //    boolean foundStudents = false;
  //    for (int i = 0; i < students.length; i++) {
  //      if (students[i].isThisGroup(enteredGroup)) {
  //        System.out.println(students[i]);
  //        foundStudents = true;
  //      }
  //    }
  //    if(!foundStudents) {
  //      System.out.println("There are no students in the group " + enteredGroup);
  //    }
  //  }

  //b) student lists for each faculty and course;
  public static void studentsFacultyGroup(Student[] students) {
          System.out.print("Please enter the faculty and after that you will see a list of the students: ");
          Scanner scanner = new Scanner(System.in);
          String enteredFaculty = scanner.next();
          System.out.print("Please enter the course and after that you will see a list of the students: ");
          Scanner scan = new Scanner(System.in);
          String enteredCourse = scanner.next();
          boolean foundStudents = false;
          for (int i = 0; i < students.length; i++) {
            if (students[i].isOnFaculty(enteredFaculty) && students[i].isOnCourse(enteredCourse)) {
              System.out.println(students[i]);
              foundStudents = true;
            }
          }
          if(!foundStudents) {
            System.out.println("There are no students for the faculty " + enteredFaculty + enteredCourse);
          }
  }
}
