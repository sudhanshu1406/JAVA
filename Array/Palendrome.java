package Array;
import java.util.Scanner;
public class Palendrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size;
        System.out.println("enter the size of an array: ");
        size = obj.nextInt();
        int arr[] = new int[size];
        int len = arr.length;
        System.out.println("enter the elements of an array: ");
        for(int i=0; i<len; ++i){
            arr[i] = obj.nextInt();
        }
        int start = 0;
        int end = len-1;
        while(start<end){
            if(arr[start] != arr[end]){
                System.out.println("not a palendrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("palendrome");
    }
}
