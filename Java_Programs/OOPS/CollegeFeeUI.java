package OOPS;

import java.util.Scanner;

public class CollegeFeeUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID: ");
        int studentID = sc.nextInt();

        System.out.println("Enter Student name: ");
        String studentName = sc.next();

        System.out.println("Enter department name: ");
        String department = sc.next();

        System.out.println("Enter gender ");
        String gender = sc.next();
        
        System.out.println("Enter Category: ");
        String category = sc.next();

        double total = 0;

        if(category.equalsIgnoreCase("DayScholar"))
        {
            System.out.println("Enter College Fee: ");
            double collegeFee = sc.nextDouble();

            System.out.println("Enter bus number: ");
            int busNumber = sc.nextInt();

            System.out.println("Enter the distance: ");
            float distance = sc.nextFloat();

            DayScholar dScholar = new DayScholar(studentID, studentName, department, gender, category, collegeFee, busNumber, distance);
            total = dScholar.calculateTotalFee();
        }

        else if(category.equalsIgnoreCase("Hosteller"))
        {
            System.out.println("Enter College Fee: ");
            double collegeFee = sc.nextDouble();

            System.out.println("Enter room number: ");
            int busNumber = sc.nextInt();

            System.out.println("Enter blockName: ");
            String blockName = sc.next();

            System.out.println("Enter the room type: ");
            String roomType = sc.next();

            Hosteller hosteller = new Hosteller(studentID, studentName, department, gender, category, collegeFee, busNumber, blockName.charAt(0), roomType);
            total = hosteller.calculateTotalFee();
        }
        
        System.out.println("The total fee is "+total);
    }
}
