public class basic1 {
  public static void main(String[] args) {
    // store 5 roll numbers
    int[] numbers = new int[5];

    // storing 5 names;
    String[] names = new String[5];

    /*
     * data of 5 students
     * Stringt[] rno = new int[5];
     * String[] name = new String[5];
     * float[] marks = new float[5];
     * how to store this in a single data-structures..=> this is why we use
     * classes..
     */

    Student[] students = new Student[5];
    System.out.println("hii" + students);
    // Student kart = new Student();
    // declaring reference to an object of type Student creating an object of
    // Student class
    // how to create an object of Student class
    // objects are stored in heap memory while reference is stored in stack memory
    Student kart = new Student(21, "kartikeu", 45.6f);
    System.out.println(kart);
    System.out.println(kart.rno);
    System.out.println(kart.marks);
    System.out.println(kart.name);

    kart.name = "kartikey";
    kart.rno = 12;
    kart.marks = 89.4f;
    System.out.println(kart);
    System.out.println(kart.rno);
    System.out.println(kart.marks);
    System.out.println(kart.name);
    System.out.println(kart);
  }
}

// creating a class
class Student {
  int rno;
  String name;
  float marks;

  Student(int rno, String name, float marks) {
    this.rno = rno;
    this.name = name;
    this.marks = marks;
  }
}
