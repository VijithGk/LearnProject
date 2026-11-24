package OOPS;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        String name1 = sc.nextLine();

        System.out.println("Enter the panno:");
        String pan1 = sc.nextLine();

        System.out.println("Enter the emailid:");
        String email1 = sc.nextLine();

        System.out.println("Enter the salary:");
        int salary1 = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Customer 2
        System.out.println("Enter the name:");
        String name2 = sc.nextLine();

        System.out.println("Enter the panno:");
        String pan2 = sc.nextLine();

        System.out.println("Enter the emailid:");
        String email2 = sc.nextLine();

        System.out.println("Enter the salary:");
        int salary2 = sc.nextInt();

        existingCustomer c1 = new existingCustomer(name1, pan1, email1, salary1);
        existingCustomer c2 = new existingCustomer(name2, pan2, email2, salary2);

        if (c1.equals(c2)) 
        {
            System.out.println("Both the objects are equal.");    
        }
        else{
            System.out.println("Both the objects are not equal.");
        }
    }
    

    
}
