package solutions;

import java.util.Objects;
import java.util.Scanner;
import java.lang.*;

public class Compair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


           System.out.println("Enter the value of co-ordinate of  line 1 x1");
            int x1 = sc.nextInt();
            System.out.println("Enter the value of coordinate of line 1 x2");
            int x2 = sc.nextInt();
            System.out.println("Enter the value of co-ordinate of line 1 y1");
            int y1 = sc.nextInt();
            System.out.println("Enter the value of co-ordinate of line 1 y1");
            int y2 = sc.nextInt();
            System.out.println("Enter the value of co-ordinate of X1 of line 2");
            int X1 = sc.nextInt();
            System.out.println("Enter the value of co-ordinate of X2 of line 2");
            int X2 = sc.nextInt();
            System.out.println("Enter the value of co-ordinate of Y1 of line 2");
            int Y1 = sc.nextInt();
            System.out.println("Enter the value of co-ordinate of Y1 of line 2");
            int Y2 = sc.nextInt();


            float a = (float) Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
            float b =(float) Math.sqrt((Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2)));
            System.out.println("Length of line is 1" + " " + a);
            System.out.println("Length of line is 2" + " " + b);
            boolean s = Objects.equals(a, b);
            if(s==true)
                System.out.println("Length of line 1 and 2 is equal");
            else
            System.out.println("Length of line 1 and 2 is not equal");

        }
}

