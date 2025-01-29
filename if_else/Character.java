package if_else;
import java.util.Scanner;
public class Character {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter your caharcter");
        char a = obj.nextLine().charAt(0);
        if(a>='A' && a<='Z')
        {
            System.out.println((char)(a+32));
        }
        else
        {
            System.out.println((char)(a-32));
        }
    }
}
