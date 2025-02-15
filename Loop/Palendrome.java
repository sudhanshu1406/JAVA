package Loop;
import java.util.Scanner;
public class Palendrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int x;
        System.out.println("Enter the input: ");
        x = obj.nextInt();
        int temp = x;
        int sum = 0;
        while(x>0)
        {
            int rem = x%10;
            sum = sum*10 + rem;
            x = x/10;
        }
        if(temp == sum)
        {
            System.out.println("Palendrome Number");
        }
        else
        {
            System.out.println("Not a Palendrome Number");
        }
    }
}
