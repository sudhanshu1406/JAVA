package Loop;
import java.util.Scanner;
public class Sum_of_n_natural {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number, sum=0;
        System.out.println("Enter the number: ");
        number = obj.nextInt();
        for(int i=1; i<=number; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
