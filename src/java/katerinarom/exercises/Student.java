package katerinarom.exercises;

import java.lang.String;

/* Create classes whose specifications are given below. Define constructors and methods setType (), getType (), toString ().
Define additional methods in the class that creates the array of objects. Define data selection criteria and display these
data to the console. In each class with information, several constructors must be declared.
1. Student: id, Surname, Name, Patronymic, Date of birth, Address, Phone, Faculty, Course, Group.
Create an array of objects. Output:
a) a list of students of a given faculty;
b) student lists for each faculty and course;
c) a list of students born after a given year;
d) list of study group.
 */

final class Student {
  private final int id;
  private String dateOfBirth; //class Student fields
  private String lastName;
  private String name;
  private String middleName;
  private String address;
  private String phoneNumber;
  private String faculty;
  private String course;
  private String group;

  Student( //constructor's fields
      int id,
      String dateOfBirth,
      String lastName,
      String name,
      String middleName,
      String address,
      String phoneNumber,
      String faculty,
      String course,
      String group) {
    this.id = id; //states saved in the fields of the student
    this.dateOfBirth = dateOfBirth;
    this.lastName = lastName;
    this.name = name;
    this.middleName = middleName;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.faculty = faculty;
    this.course = course;
    this.group = group;
  }

  @Override
  public String toString() { //concatenation
    return "Student{" +
        "id=" + id +
        ", dateOfBirth='" + dateOfBirth + '\'' +
        ", lastName='" + lastName + '\'' +
        ", name='" + name + '\'' +
        ", middleName='" + middleName + '\'' +
        ", address='" + address + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", faculty='" + faculty + '\'' +
        ", course='" + course + '\'' +
        ", group='" + group + '\'' +
        '}';
  }

  public boolean isOnFaculty(String faculty) {
    return this.faculty.equals(faculty);//
  }

  public boolean isThisYear(String dateOfBirth) {
    return this.dateOfBirth.equals(dateOfBirth);
  }

  public boolean isThisGroup(String group){
    return this.group.equals(group);
  }

  public boolean isOnCourse(String course) {
    return this.course.equals(course);
  }
}
