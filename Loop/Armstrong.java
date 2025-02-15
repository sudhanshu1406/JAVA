package Loop;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int x;
        System.out.println("Enter the input: ");
        x = obj.nextInt();
        int temp = x;
        int sum = 0;
        int count =0;
        int digit = 0;
        int result = 1;
        while(x!=0)
        {
            x = x/10;
            count++;
        }
        for(int i=1; i<=count; i++)
        {
            result = result*x;
        }
        while(x>0)
        {
            digit = x%10;
            sum = sum + result;
            x = x/10;
        }
        if(temp == sum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
    }
}
