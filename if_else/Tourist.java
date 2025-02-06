package if_else;
import java.util.Scanner;
public class Tourist {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String place;
        System.out.println("you are at WWW.Tourism.com");
        System.out.println("where you want to go international visit or domistic visit");
        place = obj.nextLine();
        if(place.equals("international visit"))
        {
            System.out.println("you are at international visit");
            System.out.println("there are two places japan and russia");
            place = obj.nextLine();

            if(place.equals("japan"))
            {
                System.out.println("you have to pay 1000$");
            }
            else if(place.equals("russia"))
            {
                System.out.println("you have to pay 2000$");
                System.out.println("you get 2 russian free free free");
            }
            else
            {
                System.out.println("invalid place");
            }
        }
        else if(place.equals("domistic visit"))
        {
            if(place.equals("bhopal"))
            {
                System.out.println("you have to pay 100$");
            }
            else if(place.equals("indore"))
            {
                System.out.println("you have to pay 200$");
            }
            else
            {
                System.out.println("invalid place");
            }
        }
        else
        {
            System.out.println("invalid place");
        }
    }
}