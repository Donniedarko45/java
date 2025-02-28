/*
everything in java is a class the name of file and name of class should be same 
public means this class can be accessed from anywhere
*/
public class area {
  public static void main(String[] args) {
    double a = 5, b = 4, c = 3;
    double s = (a + b + c) / 2;
    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    System.out.println("Area of Triangle is: " + area);
  }
}
