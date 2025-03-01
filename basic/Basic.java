
import java.util.Scanner;

public class Basic {
  public static void main(String k[]) {

    Scanner input = new Scanner(System.in); // new keyword is creating a object
    // System.in means something keyboard
    // input.close();
    System.out.println("enter your name: ");
    String name = input.next();
    input.close();
    System.out.println("Hello World " + name);
    System.out.print(5879);
  }
}

// how to take input from java
