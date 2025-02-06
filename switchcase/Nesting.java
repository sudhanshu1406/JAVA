package switchcase;
import java.util.Scanner;
public class Nesting {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String input;
        System.out.println("Enter the input: ");
        input = obj.nextLine();
        switch(input) {
            case "hello":
                System.out.println("Hello");
                break;
            case "hi":
                System.out.println("Hi");
                break;
            case "bye":
                System.out.println("Bye");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
