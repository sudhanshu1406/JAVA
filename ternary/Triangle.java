package ternary;
import java.util.Scanner;
public class Triangle {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter sum of sides of triangle");
        System.out.println("enter sides of first tringle");
        int side1,side2,side3;
        int tri1,tri2,tri3;

        side1 = obj.nextInt();
        side2 = obj.nextInt();
        side3 = obj.nextInt();
        tri1 = side1 + side2 + side3;

        System.out.println("enter sides of second tringle");
        side1 = obj.nextInt();
        side2 = obj.nextInt();
        side3 = obj.nextInt();
        tri2 = side1 + side2 + side3;

        System.out.println("enter sides of third tringle");
        side1 = obj.nextInt();
        side2 = obj.nextInt();
        side3 = obj.nextInt();
        tri3 = side1 + side2 + side3;
        String result;
        result = (tri1==tri2 && tri2==tri3)?"equilateral triangles":"not an equilaterla triangles";
        System.out.println(result);
    }
}
