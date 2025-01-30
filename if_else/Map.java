package if_else;
import java.util.Scanner;
public class Map {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int path;
        System.out.println("enter your location");
        path = obj.nextInt();
        if(path == 1)
        {
            System.out.println("you are in path 1");
            System.out.println("there is three paths 2,3,4");
            System.out.println("enter your path");
            path = obj.nextInt();
            if(path == 2)
            {
                System.out.println("you are in path 2");
                System.out.println("there is two paths 3,4");
                path = obj.nextInt();
                if(path == 3)
                {
                    System.out.println("you are in path 3");
                    System.out.println("there is only one path 4");
                    path = obj.nextInt();
                    if(path == 4)
                    {
                        System.out.println("you are in path 4");
                        System.out.println("destination reached");   
                    }
                    else
                    {
                        System.out.println("invalid path");
                    }
                }
                else if(path == 4)
                {
                    System.out.println("you are in path 4");
                    System.out.println("destination reached");
                }
                else
                {
                    System.out.println("invalid path");
                }
            }
            else if(path == 3)
            {
                System.out.println("you are in path 3");
                System.out.println("there is two paths 2,4");
                path = obj.nextInt();
                if(path == 2)
                {
                    System.out.println("you are in path 2");
                    System.out.println("there is only one path 4");
                    path = obj.nextInt();
                    if(path == 4)
                    {
                        System.out.println("you are in path 4");
                        System.out.println("destination reached");   
                    }
                    else
                    {
                        System.out.println("invalid path");
                    }
                }
                else if(path == 4)
                {
                    System.out.println("you are in path 4");
                    System.out.println("destination reached");
                }
                else
                {
                    System.out.println("invalid path");
                }
            }
            else if(path == 4)
            {
                System.out.println("you are in path 4");
                System.out.println("destination reached");
            }
            else
            {
                System.out.println("invalid path");
            }
        }
    }
}
