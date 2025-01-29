package if_else;
import java.util.Scanner;
public class Letter {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String word;
        char letter;
        System.out.println("enter your word");
        word = obj.nextLine();
        System.out.println("enter your letter to search");
        letter = obj.nextLine().charAt(0);

        if(word.charAt(0)==letter)
        {
            System.out.println("letter found"+" "+letter);
        }
        else if(word.charAt(1)==letter)
        {
            System.out.println("letter found"+" "+letter);
        }
        else if(word.charAt(3)==letter)
        {
            System.out.println("letter found"+" "+letter);
        }
        else if(word.charAt(4)==letter)
        {
            System.out.println("letter found"+" "+letter);
        }
        else if(word.charAt(5)==letter)
        {
            System.out.println("letter found"+" "+letter);
        }
        else
        {
            System.out.println("letter not found");
        }
    }
}
