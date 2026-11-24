package OOPS;

import java.util.Scanner;

public class VolumeUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Choice: ");
        System.out.println("1. Find volume for Cylinder"
            +"\n2. Find volume for Cuboid"
        );
        int choice = sc.nextInt();
        
        if(choice==1)
        {
            System.out.println("Enter the radius: ");
            double radius = sc.nextDouble();
            System.out.println("Enter the Height: ");
            double height = sc.nextDouble();

            VolumneCalculator vc = new VolumneCalculator();
            System.out.printf("Volume of the cylinder is %.2f", vc.calculateVolume(radius, height));
        }
        else if(choice==2)
        {
            System.out.println("Enter the Length: ");
            int lenght = sc.nextInt();
            System.out.println("Enter the breadth: ");
            int breadth = sc.nextInt();
            System.out.println("Enter the height: ");
            int height = sc.nextInt();

            VolumneCalculator vc = new VolumneCalculator();
            System.out.printf("Volume of Cuboid is %.2f", vc.calculateVolume(lenght, breadth, height));
        }
        else
        {
            System.out.println("Wrong Input!");
            sc.close();
        }

    }
}
