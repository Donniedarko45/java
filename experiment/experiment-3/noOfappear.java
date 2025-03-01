// wap that counts how many times a given number appears in an array

import java.util.Scanner;

public class noOfappear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the number: ");
    int num = sc.nextInt();
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == num) {
        count++;
      }
    }
    sc.close();
    System.out.println(num + "appears" + count + "times");
  }
}
