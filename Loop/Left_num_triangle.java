package Loop;
import java.util.Scanner;
public class Left_num_triangle {
    public static void main(String[] args) {
        for(int r=1; r<=5; ++r){
            for(int c=1; c<=r; ++c){
                if(c>=6-r){
                    System.out.print(c);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
