package Array;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // 1.Declaration of an array

        int[] arr1;// this is an standard method to declare an array
        int arr2[];

        // int arr[5]; //Wrong declaration of an array

// =============================================================================================

        // 2.Creation of an array

        int arr3[] = new int[5]; // this is an standard method to create an array
        // arr3[] = new int[5]; //second way to create an array

// ================================================================================================
        // 3.Initialization of an array

        int arr4[] = {1, 2, 3, 4, 5}; // this is an standard method to initialize an array
        // int arr4[] = new int[]{1, 2, 3, 4, 5}; // second way to initialize an array

// ================================================================================================
        // Retrival of an array

        for(int i=0; i<=5; ++i){
            System.out.println(arr4[i]);
        } 
        // normal way to print an array

        for(int i:arr4){
            System.out.println(i);
        }
        // another way to print an array using for-each loop
    }
}
