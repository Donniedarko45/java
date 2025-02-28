//printing the fibonacci series

import java.util.Scanner;

public class fibn {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of terms you want in the fibonacci series: ");
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    int c;
    sc.close(); // memory leak
    System.out.print(a + " ");
    System.out.print(b + " ");
    for (int i = 0; i < n - 2; i++) {
      c = a + b;
      System.out.print(c + " ");
      a = b;
      b = c;
    }
  }
}
