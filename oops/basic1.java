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
    Student kart;
  }

  // creating a class
  class Student {
    int[] rno = new int[5];
    String[] name = new String[5];
    float[] marks = new float[5];
  }
}
