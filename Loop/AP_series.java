package Loop;
import java.util.Scanner;
public class AP_series {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a, d, n;
        System.out.println("Enter the first term of the series: ");
        a = obj.nextInt();
        System.out.println("Enter the common difference of the series: ");
        d = obj.nextInt();
        System.out.println("Enter the number of terms of the series: ");
        n = obj.nextInt();
        int sum = 0;
        for(int i=0; i<n; ++i){
            sum = a + i*d;
            System.out.println("the series is: " + sum);
        }
    }
}
