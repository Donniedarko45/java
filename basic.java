/*
everything in java is a class the name of file and name of class should be same 
public means this class can be accessed from anywhere
*/
public class  basic{
  public static void  main(String[] args) {
   try {
    int x = 0;
    int y = 5 / x;
} catch (Exception e) {
    System.out.println("Exception");
} catch (ArithmeticException ae) {
    System.out.println("Arithmetic Exception");
}
System.out.println("finished");
  } 
}
