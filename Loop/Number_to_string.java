package Loop;
import java.util.Scanner;
public class Number_to_string {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number;
        System.out.println("Enter your number to convert into string: ");
        number = obj.nextInt();
        int digit = 0;
        int d1;
        int rv = 0;
        String result;
        int count = 0;
        while(number>0){
            digit = number%10;
            rv = rv*10 + digit;
            count++;
            number = number/10;
        }
        while(count!=0){
            digit = rv%10;
            result = switch(digit)
            {
                case 0 -> "zero";
                case 1->"one";
                case 2->"two";
                case 3->"three";
                case 4->"four";
                case 5->"five";
                case 6->"six";
                case 7->"seven";
                case 8->"eight";
                case 9->"nine";
                default->"invalid input";

            };
            System.out.print(result + " "); 
            count--;
            rv = rv/10;
        }        
    }
}
