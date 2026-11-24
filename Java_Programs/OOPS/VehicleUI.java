package OOPS;

import java.util.Scanner;

public class VehicleUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Vehicle vehicle;

        System.out.println("Enter \n1.Bike \n2.Car");
        int choice = sc.nextInt();

        if(choice==1)
        {
            System.out.println("Enter Vehicle ID: ");
            String vehicleID = sc.next();

            System.out.println("Enter Vehicle Name: ");
            String brand = sc.next();

            System.out.println("Enter Base Rate: ");
            double baseRate = sc.nextDouble();

            System.out.println("Rental Duration: ");
            int days = sc.nextInt();

            vehicle = new Bike(vehicleID, brand, baseRate);
            System.out.println("Vehicle Info: ");
            vehicle.displayVehicleInfo(days);
            System.out.println("Daily Rate: "+vehicle.calculateDailyRate());
            System.out.println("Total Rate: "+vehicle.calculateTotalCost(days));
            
        }

        else if(choice==2)
        {
            System.out.println("Enter Vehicle ID: ");
            String vehicleID = sc.next();

            System.out.println("Enter Vehicle Name: ");
            String brand = sc.next();

            System.out.println("Enter Base Rate: ");
            double baseRate = sc.nextDouble();

            System.out.println("Rental Duration: ");
            int days = sc.nextInt();

            vehicle = new Car(vehicleID, brand, baseRate);
            System.out.println("Vehicle Info: ");
            vehicle.displayVehicleInfo(days);
            System.out.println("Daily Rate after Discount/Surcharge: "+vehicle.calculateDailyRate());
            System.out.println("Total Rate: "+vehicle.calculateTotalCost(days));
            
        }
        else{
            System.out.println("Invalid Input!");
        }
    }
}
