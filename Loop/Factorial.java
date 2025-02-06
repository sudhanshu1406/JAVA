package Loop;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number, factorial=1;
        System.out.println("Enter the number: ");
        number = obj.nextInt();
        for(int i=1; i<=number; i++){
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
