package OOPS;

import java.util.Scanner;

public class StoreUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String name = sc.next();

        System.out.println("Enter customer phone number: ");
        String phoneNumber = sc.next();

        System.out.println("Enter Street name: ");
        String streetName = sc.next();
        sc.next();
        System.out.println("Enter bill amount: ");
        double billAmount = sc.nextDouble();

        System.out.println("Enter distance: ");
        int distance = sc.nextInt();

        CustomerDetails cd = new CustomerDetails(name, phoneNumber, streetName, billAmount, distance);
        double bonusPoints = cd.calculateBonusPoints();
        double deliverCharge = cd.deliveryCharge();

        System.out.println(cd.toString());
        
    }
}
