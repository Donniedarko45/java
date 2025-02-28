class Student {
  static String universityName = "UPES-Dehradun";
  String studentName;

  public Student(String studentName) {
    this.studentName = studentName;
  }

  static void displayUniiName() {
    System.out.println("University: " + universityName);
    studentName = "hello";
  }

  public void displayStudent() {
    System.out.println("Student Name: " + studentName);

  }
}

public class unii {
  public static void main(String[] args) {
    Student.displayUniiName();

    Student s1 = new Student("kartikey");
    Student s2 = new Student("adarsh");

    s1.displayStudent();
    s2.displayStudent();
  }
}
