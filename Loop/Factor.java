package Loop;
import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");
        number = obj.nextInt();
        for(int i=1; i<=number; i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
    }
}
