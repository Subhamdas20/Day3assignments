package com.bz.linecomparison;
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
        Float length_Line1 = (float) Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        Float length_Line2 = (float) Math.sqrt((Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2)));
        System.out.println("Length of line is 1" + " " + length_Line1);
        System.out.println("Length of line is 2" + " " + length_Line2);
        int compare = length_Line1.compareTo(length_Line2);
        if(compare==0)
            System.out.println("Length of Line 1 is equal to line 2");
        else if (length_Line1>length_Line2)
            System.out.println("Length of Line 1 is greater");
        else
            System.out.println("Length of Line 2 is greater");
    }
}
