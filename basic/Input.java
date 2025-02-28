package basic;
import java.util.Scanner;

public class Input {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rollnumber: ");
        int rollnum = input.nextInt();
        System.out.println("entered rollnum is "+ rollnum);
    }
}