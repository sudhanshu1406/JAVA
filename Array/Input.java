package Array;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of an array: ");
        size = obj.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of an array: ");
        for(int i=0; i<arr.length; ++i){
            arr[i] = obj.nextInt();
        }
        for(int i:arr){
            System.out.println("Elements of an array are: ");
            System.out.println(i);
        }
    }
}
