package switchcase;
import java.util.Scanner;
public class Switch{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int number;
        System.out.println("Enter a number");
        number = obj.nextInt();
        String result;
        result = switch(number){

            case 1->"One";

            case 2->"two";

            case 3->"three";

            case 4->"four";

            case 5->"Five";

            default->"Invalid number";
        };
        System.out.println(result);
    }
}