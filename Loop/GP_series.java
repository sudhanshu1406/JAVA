package Loop;
import java.util.Scanner;
public class GP_series {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a, r, n;
        System.out.println("Enter the first term of the series: ");
        a = obj.nextInt();
        System.out.println("Enter the common ratio of the series: ");
        r = obj.nextInt();
        System.out.println("Enter the number of terms of the series: ");
        n = obj.nextInt();
        int sum = 0;
        for(int i=0; i<n; ++i){
            sum = a * (int)Math.pow(r, i);
            System.out.println(sum);
        }
    }
}
