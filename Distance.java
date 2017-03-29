//Question 22
//Write a program to input two points with x and y coordinates and find the distance between them.

import java.util.*;
class Distance
{
public static void main(String[] args)
{
    Point first, second;
    if(args.length==4)
    {
        first = new Point(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
        second = new Point(Integer.valueOf(args[2]), Integer.valueOf(args[3]));
    }
    else
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first point: ");
        first = new Point(input.nextInt(),input.nextInt());

        System.out.println("Enter second point: ");
        second = new Point(input.nextInt(),input.nextInt());
    }
    double d = first.distance(second.x, second.y);

    System.out.println("Distance between " + 
        "(" + first.x + "," + first.y + ")" + 
        " and " + 
        "(" + second.x + "," + second.y + ")" + 
        " is " + d);
    System.out.println();
}
}