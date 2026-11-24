package exception;

import java.util.Scanner;

public class BillSplitter 
{

    public static double billCalculation(double totalAmount, int numofPeople) throws InvalidBillAmountException
    {
        if(!(totalAmount==0))
        {
            if(numofPeople==0)
            {
                throw new ArithmeticException("Number of people cannot be zero");
            }
            else return totalAmount/numofPeople;

        }
        else
        {
            throw new InvalidBillAmountException("Invalid bill amount");
        }
    }

    public static void main(String[] args) 
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the total bill amount with number of people like this (1200.50,4): ");
            String input = sc.nextLine();
            String[] parts = input.split(",");
            double totalAmount = Double.parseDouble(parts[0]);
            int numofPeople = Integer.parseInt(parts[1]);

            double amountPerPerson = billCalculation(totalAmount, numofPeople);
            System.out.println("Each person should pay: " + amountPerPerson);
        }catch(InvalidBillAmountException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error: Invalid input format. Please enter the total amount and number of people in the correct format.");
        }
        
    }
}
