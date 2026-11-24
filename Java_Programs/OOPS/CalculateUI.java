package OOPS;

import java.util.Scanner;

public class CalculateUI
{
    public static Calculate calculateSlope()
    {
        Calculate c = (x1,x2,y1,y2) -> "Solpe of the line is: "+(y2-y1)/(x2-x1);
        return c;
    }

    public static Calculate calculateMidPoint()
    {
        Calculate c = (x1,x2,y1,y2) -> "Mid point of the line is: "+((x1+x2)/2)+","+((y1+y2)/2);
        return c;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for x intercepts and y intercepts");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();

        sc.close();
        Calculate calculate = calculateSlope();
        String res = calculate.performCalculation(x1, x2, y1, y2);
        Calculate calculate2 = calculateMidPoint();
        String res2 = calculate2.performCalculation(x1, x2, y1, y2);
        System.out.println(res);
        System.out.println(res2);
    }
}
