package Array;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};
        int sum=0;
        for(int i=0; i<=arr.length; ++i){
            sum +=i;
        }
        System.out.println("sum of an array is: " + sum);
    }
}
