import java.util.Scanner;
public class calculator{
  public static void  main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    double a = sc.nextDouble();
    System.out.println("Enter the second number: ");
    double b = sc.nextDouble();
    System.out.println("Enter the operator: ");
    sc.nextLine();
    char operation = sc.nextLine().charAt(0);
    double result = 0;
    switch(operation){
      case '+':
        result = a+b;
        break;
      case '-':
        result = a-b;
        break;
      case '*':
        result = a*b;
        break;
      case '/':
        result = a/b;
        break;
      default:
        System.out.println("Invalid Operation");
    }
    System.out.println("The result is: "+result);
  } 
}


