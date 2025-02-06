package if_else;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Double temp;
        System.out.println("Enter the temperature");
        temp = obj.nextDouble();
        if(temp>=0 || temp<=0)
        {
            String type;
            System.out .println("now select the conversion type");
            System.out.println("(C to F) for Celsius to Fahrenheit");
            System.out.println("(F to C) for Fahrenheit to Celsius");
            
            obj.nextLine();
            type = obj.nextLine();

            if(type.equals("C to F"))
            {
                System.out.println("The temperature in Fahrenheit is: " + (temp*9/5+32));
            }
            else if(type.equals("F to C"))
            {
                System.out.println("The temperature in Celsius is: " + ((temp-32)*5/9));
            }
            else
            {
                System.out.println("Invalid type");
            }
        }
        else
        {
            System.out.println("Invalid temperature");
        }
    }
}

// package if_else;
// import java.util.Scanner;
// public class Temperature {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         Double temp;
//         System.out.println("Enter the temperature");
//         temp = obj.nextDouble();
//         if(temp>=0 || temp<=0)
//         {
//             int type;
//             System.out .println("now select the conversion type");
//             System.out.println("1 for Celsius to Fahrenheit");
//             System.out.println("2 for Fahrenheit to Celsius");

//             type = obj.nextInt();

//             if(type==1)
//             {
//                 System.out.println("The temperature in Fahrenheit is: " + (temp*9/5+32));
//             }
//             else if(type==2)
//             {
//                 System.out.println("The temperature in Celsius is: " + ((temp-32)*5/9));
//             }
//             else
//             {
//                 System.out.println("Invalid type");
//             }
//         }
//         else
//         {
//             System.out.println("Invalid temperature");
//         }
//     }
// }
