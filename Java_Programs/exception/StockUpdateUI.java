package exception;

import java.util.Scanner;

public class StockUpdateUI 
{
    public static boolean validateProductPrice(int price) throws InvalidPriceException
    {
        if(price<1 || price>20)
        {
            throw new InvalidPriceException("Product Price is Invalid");
        }

        else
        {
            return true;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of product entries: ");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++)
        {
            System.out.println("Enter product " + i + " details:");
            String userInput = sc.next();
            String input[] = userInput.split(":");
            String productCode = input[0];
            String producatType = input[1];
            int productPrice = Integer.parseInt(input[2]);
            try
            {
                if(validateProductPrice(productPrice))
                {
                    System.out.println("Product upadated successfully");
                }
            }
            catch(InvalidPriceException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
