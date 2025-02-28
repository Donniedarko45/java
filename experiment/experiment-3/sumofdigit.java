import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args) {
        int sum=0;
        //we have to calculate sum of digit of a number, the number is taen as an input
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter the number: ");
        int num = sc.nextInt(); 
        while (num>0) {
            sum+=num%10;
            num=num/10;  
        }
        System.out.println("The sum of the digits is: "+sum);
    }
}


/**
 *
 * 54%10 = 4
 *
 *
 */
