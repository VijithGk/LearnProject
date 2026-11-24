package OOPS;

import java.util.Scanner;

public class TicketsUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of passengers");
        int noOfPassangers = sc.nextInt();
        for(int i=1; i<=noOfPassangers; i++)
        {
            System.out.println("Passenger "+i);

            System.out.println("Enter the ticket ID: ");
            int ticketId = sc.nextInt();

            System.out.println("Enter the passenger name: ");
            String name = sc.next();

            System.out.println("Enter the gender: ");
            String gender = sc.next();

            System.out.println("Enter the address: ");
            String address = sc.next();

            Ticket t = new Ticket(ticketId, name, gender, address);
            System.out.println(t.toString());
        }

        
    
    }

    
}
