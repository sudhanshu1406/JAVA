package Loop;
import java.util.Scanner;
public class Perfact {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number;
        System.out.println("Enter your number to check whether it is perfect or not: ");
        number = obj.nextInt();
        int sum = 0;
        for(int i = 1; i<number; i++){
            if(number%i==0){
                sum = sum + i;
            }
        }
        if(sum==number)
        {
            System.out.println("perfect number");
        }
        else
        {
            System.out.println("not a perfect number");
        }
    }
}
