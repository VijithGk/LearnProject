package Collections;

import java.util.Scanner;

public class ArrayListUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Products products = new Products();

        int choice;

        do {
            System.out.println(" 1.Add \n 2.Display \n 3.Exit \n Enter your choice");
            choice = sc.nextInt();

            if(choice == 1)
            {
                System.out.println("Enter the product");
                String product = sc.next();

                products.addProductToList(product);
                products.sortProductList();
            } 
            else if(choice == 2)
            {
                System.out.println(products.getProductList());
            }
            else if(choice == 3)
            {
                System.out.println("Thank you for using the application");
            }
            else
            {
                System.out.println("Invalid choice");
            }

        } while (choice != 3);

        sc.close();
    }
}