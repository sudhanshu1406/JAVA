package Loop;
import java.util.Scanner;
public class I_triangle {
    public static void main(String[] args) {
        for(int r=1; r<=5; r++){
            for(int c=1; c<=9; c++){
                if(c>=r && c<=10-r){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
