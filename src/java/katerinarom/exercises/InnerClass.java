package katerinarom.exercises;

/*Create a record-book class with an inner class, with the help of which you can store information about sessions, tests, exams.
*/

final class InnerClass {
  private String name; // class fields
  private String faculty;
  private SessionInfo sessionInfo; // a link for an inner class

  public InnerClass(String name, String faculty) { //constructor
    this.name = name;
    this.faculty = faculty;

  }

  // inner class declaring
  private class SessionInfo {
    private String students;
    private String marks;
    private String exams;

    public void setStudents(String students) {
      // constructor
      this.students = students;
    }

    public void setMarks(String marks) {
      // constructor
      this.marks = marks;
    }

    public String determineExam() {
      String temp = "";
      exams = temp;
      return exams;
    }
  }

  public String getName() {
    return name;
  }

  public String getFaculty() {
    return faculty;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }

  public String getSessionInfo() {
    if (sessionInfo != null) {
      return ("+" + sessionInfo.students + "-"
          + sessionInfo.marks + "-" + sessionInfo.exams);
    } else {
      return ("the session doesn't exist");
    }
  }

  public void obtainSessionInfo(String students, String marks) {
    sessionInfo = new SessionInfo();
    sessionInfo.setStudents(students);
    sessionInfo.setMarks(marks);
  }
  @Override
  public String toString() {
    StringBuilder s = new StringBuilder(100);
    s.append("Student '" + name + "':\n");
    s.append(" Faculty - " + faculty + "\n");
    return s.toString();
  }
}
