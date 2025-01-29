package ternary;
import java.util.Scanner;
public class Divisible {
    public static void main(String []args){
        Scanner obj = new Scanner(System.in);

        System.out.println("enter your number");
        int number;
        number = obj.nextInt();
        String result;
        result = ((number%2==0 && number%4==0 && number%6==0) && (number%8!=0))?"divisible by 2,4,6 and not by 8":"not divisable";
        System.out.println(result);
    }
}
