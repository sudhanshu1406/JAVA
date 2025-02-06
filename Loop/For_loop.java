package Loop;
import java.util.Scanner;
public class For_loop {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");
        number = obj.nextInt();
        for(int i=0; i<=number; i++) {
            System.out.println(i);
        }
    }
}
