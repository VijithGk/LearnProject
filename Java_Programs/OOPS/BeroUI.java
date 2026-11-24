package OOPS;

import java.util.Scanner;

public class BeroUI 
{


   public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name");
        String customerName = sc.nextLine();
        System.out.println("Enter Phone Number");
        long phoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter address");
        String address = sc.nextLine();
        System.out.println("Enter Bero Type");
        String beroType = sc.nextLine();
       
        if(beroType.equals("Steel Bero")) {
             System.out.println("Enter Bero Colour");
        String beroColour = sc.nextLine();
            System.out.println("Enter Bero Height");
            int beroHeight = sc.nextInt();
            SteelBero sObj = new SteelBero(beroType, beroColour, beroHeight);
            sObj.calculatePrice();
            DiscountBero dObj = new DiscountBero();
            double discount = dObj.calculateDiscount(sObj);
            System.out.printf("Amount needs to be paid %.2f",sObj.getPrice()-discount);
        } else if(beroType.equals("Wooden Bero")) {
            System.out.println("Enter Bero Colour");
            String beroColour = sc.nextLine();
            System.out.println("Enter Wood Type");
            String woodType = sc.nextLine();
            WoodenBero wBero = new WoodenBero(beroType, beroColour, woodType);
            wBero.calculatePrice();
            DiscountBero dObj = new DiscountBero();
            double discount =  dObj.calculateDiscount(wBero);
            System.out.printf("The amount to be paid is: %.2f", wBero.getPrice()-discount);
        }
        else
        System.out.println(beroType+" is an invalid bero type");
    }
}                                

