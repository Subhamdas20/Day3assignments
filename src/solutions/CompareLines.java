package solutions;
import java.lang.Float;
import java.lang.*;
import java.util.*;

public class CompareLines {
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


        Float l1 = (float) Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        Float l2 = (float) Math.sqrt((Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2)));
        System.out.println("Length of line is 1" + " " + l1);
        System.out.println("Length of line is 2" + " " + l2);
        int s = l1.compareTo(l2);
        if(s==0)
            System.out.println("Line 1 is equal to line 2");
        else if (l1>l2)
            System.out.println("Line 1 is greater");
        else
            System.out.println("Line 1 is greater");


    }
}
