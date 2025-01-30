package if_else;
import java.util.Scanner;
public class Asian_paints {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String color1;
        String color2;
        System.out.println("Enter the color1: from red, white");
        color1 = obj.nextLine();
        System.out.println("Enter the color2: from blue, green, red");
        color2 = obj.nextLine();

        if(color1.equals("red") && color2.equals("blue")){
            System.out.println("The color is purple");
        }
        else if(color1.equals("white") && color2.equals("green")){
            System.out.println("The color is light green");
        }
        else if(color1.equals("white") && color2.equals("red")){
            System.out.println("The color is pink");
        }
        else{
            System.out.println("Invalid color");
        }
    }
}
