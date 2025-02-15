package Array;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of an array: ");
        size = obj.nextInt();
        int arr[] = new int[size];
        int len = arr.length;
        System.out.println("Enter the elements of an array: ");
        for(int i=0; i<len; ++i){
            arr[i] = obj.nextInt();
        }
        int start = 0;
        int end = len-1;
        while(start<end){
            int temp;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
