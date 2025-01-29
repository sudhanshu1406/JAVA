package if_else;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int pass;
        System.out.println("enter your password");
        pass = obj.nextInt();
        if(pass==1234)
        {
            System.out.println("open");
        }
        else
        {
            System.out.println("worng password try again");
            pass = obj.nextInt();
            if(pass==1234)
            {
                System.out.println("open");
            }
            else
            {
                System.out.println("locked");
            }
        }
    }
}
