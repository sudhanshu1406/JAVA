package ternary;
import java.util.Scanner;
public class Character {
    public static void main(String []args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter character");
        char a = obj.nextLine().charAt(0);
        System.out.println((a>='A' && a<='Z')?((char)(a+32)):((char)(a-32)));
    }
}
