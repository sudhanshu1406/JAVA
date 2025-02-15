package Loop;
import java.util.Scanner;
public class Nth_term {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the term of series: ");
        n = obj.nextInt();
        for(int i=1; i<=n; i++){
            sum = sum*10 + 1;
            System.out.println(sum);
        }
    }
}
