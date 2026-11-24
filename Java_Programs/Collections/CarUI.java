package Collections;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CarUI 
{
    public static void main(String[] args) throws InputMismatchException
    {
        Scanner sc = new Scanner(System.in);
        CarRegistryManager cManager = new CarRegistryManager();

        while(true)
        {
            System.out.println("\n----Car Registery Manager----");
            System.out.println("\n1. Register a Car");
            System.out.println("2. View all Registered Cars");
            System.out.println("3. Update the plate of Registered Cars");
            System.out.println("4. Delete Licence Plates from system");
            System.out.println("5. Get Latest Plate");
            System.out.println("6. Get Total nuber of Registered Cars");
            System.out.println("7. Exit Application");

            try
            {
                int choice = sc.nextInt();
                if(!(choice>0 && choice<=7))
                {
                    System.out.println("Select a Vaild Option");
                    continue;
                }
                else
                {
                    switch(choice)
                    {
                        case 1:
                            System.out.println("Enter the number of cars to be registered: ");
                            int numofCars = sc.nextInt();
                            for(int i=0;i<numofCars;i++)
                            {
                                System.out.println("Enter the Car Register Number(KA-01-AB-1234)");
                                String plate = sc.next();
                                    
                                if(cManager.regCar(plate))
                                {
                                    System.out.println("Car was Registered Successfully!");
                                }
                                else
                                    throw new InputMismatchException("Incorrect Car Registery Format");
                            }
                            break;
                        
                        case 2:
                            System.out.println("\nDisplaying all the Registered Cars...\n"+cManager.viewAllRegisteredCars());
                            break;   
                            
                        case 3:
                            System.out.println("Enter the Plate number to be updated: ");
                            String oldPlate = sc.next();
                            System.out.println("Enter the new plate number: ");
                            String newPlate = sc.next();
                            if(cManager.updatePlate(oldPlate, newPlate))
                            {
                                System.out.println("\nPlates were updated successfully\nUpdated Plate Number: "+oldPlate+" TO "+newPlate);
                            }
                            break;
                        
                        case 4:
                            System.out.println("Enter the car plate that should be deleted: ");
                            String plate = sc.next();
                            if(CarUtil.validateNumberPlate(plate))
                            {
                                if (cManager.deleteCar(plate)) 
                                {
                                    System.out.println(plate+" was deleted successfully");
                                }
                                else
                                {
                                    System.out.println("Entered plate is not present in the system!");
                                }
                            }else
                            {
                                System.out.println("Invalid Plate Number!");
                            }
                            break;

                        case 5:
                            if(cManager.recentPlate() == null)
                            {
                                System.out.println("No plate found in the database");
                            }
                            else
                            {
                                System.out.println("The latest issued plate is: "+cManager.recentPlate());
                            }
                            break;
                        
                        case 6:
                            System.out.println("Fetching total number of cars: >>> "+cManager.getTotalCars());
                            break;
                        
                        case 7:
                            System.out.println("Thanks for using the application");
                            System.exit(0);
                    }
                }
            }catch(InputMismatchException e)
            {
                System.out.println("Error: "+e.getMessage());
            }
            
        }
    }
}
