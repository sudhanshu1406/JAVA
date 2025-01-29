package if_else;
import java.util.Scanner;
public class Divisable {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number;
        System.out.println("enter your number");
        number = obj.nextInt();
        if((number%2==0 && number%4==0 && number%6==0) && (number%8!=0))
        {
            System.out.println("divisable by 2,4 6");
        }
        else
        {
            System.out.println("not divisable");
        }
    }
}
