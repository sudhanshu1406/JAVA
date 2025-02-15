package Loop;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number;
        int power;
        System.out.println("enter your number");
        number = obj.nextInt();
        System.out.println("enter its power");
        power = obj.nextInt();
        int result = 1;
        for(int i=1; i<=power; i++)
        {
            result = result*number;
        }
        System.out.println(result);
    }
}
