package OOPS;

import java.util.Scanner;

public class OrderUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // NAME
        System.out.println("Enter the Name: ");
        String customerName = sc.nextLine();

        // ORDER NUMBER
        System.out.println("Enter the Order Number: ");
        int orderNumber = sc.nextInt();
        sc.nextLine(); // clear buffer

        // DELIVERY TYPE (with validation loop)
        String deliveryType;
        while (true)
        {
            System.out.println("Enter the Delivery Type (Home Delivery / Parcel / Normal Order): ");
            deliveryType = sc.nextLine();

            if (deliveryType.equalsIgnoreCase("Home Delivery") ||
                deliveryType.equalsIgnoreCase("Parcel") ||
                deliveryType.equalsIgnoreCase("Normal Order"))
            {
                break; // valid input
            }
            else
            {
                System.out.println("Invalid Order Type! Try again.");
            }
        }

        // FOOD NAME
        System.out.println("Enter the Food Name: ");
        String foodName = sc.nextLine();

        // PHONE NUMBER
        System.out.println("Enter the Phone Number: ");
        long phoneNumber = sc.nextLong();

        // PRICE
        System.out.println("Enter the price: ");
        double price = sc.nextDouble();

        // OBJECT CREATION
        Order od = new Order(customerName, orderNumber, deliveryType, foodName, phoneNumber);
        double bill = od.calculateTotalBill(price);

        // OUTPUT
        System.out.println("\n--- Order Details ---");
        System.out.println("Name: " + od.getCustomerName());
        System.out.println("Order Number: " + od.getOrderNumber());
        System.out.println("Delivery Type: " + od.getDeliveryType());
        System.out.println("Food Name: " + od.getFoodName());
        System.out.println("Phone Number: " + od.getPhoneNumber());
        System.out.println("Bill Amount: " + bill);

        sc.close();
    }
}