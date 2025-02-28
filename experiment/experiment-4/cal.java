class Calculator {
  public int add(int a, int b) {
    return a + b;
  }

  public double add(double a, double b) {
    return a + b;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }
}

public class cal {
  public static void main(String[] args) {
    Calculator cal = new Calculator();

    System.out.println("Addition of two integers: " + cal.add(5, 10));
    System.out.println("Addition of two doubles: " + cal.add(5.5, 10.2));
    System.out.println("Addition of three integers: " + cal.add(1, 2, 3));
  }
}
