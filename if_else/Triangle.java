package if_else;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int tri1,tri2,tri3;
        System.out.println("enter sum of the sides of triangles");
        tri1 = obj.nextInt();
        tri2 = obj.nextInt();
        tri3 = obj.nextInt();
        if(tri1==tri2 && tri2==tri3)
        {
            System.out.println("equilateral triangles");
        }
        else
        {
            System.out.println("not an equilateral triangles");
        }
    }
}
