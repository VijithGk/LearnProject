package OOPS;

import java.util.Scanner;

import org.xml.sax.SAXException;

public class movieUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        movieTicket mTicket = new movieTicket();

        System.out.println("Enter the Movie Name: ");
        String movieName = sc.next();

        System.out.println("Enter no of Bookings: ");
        int noofbookings = sc.nextInt();

        System.out.println("Enter the available tickets: ");
        int availableTickets = sc.nextInt();
        
        movieTicket.setAvailableTickets(availableTickets);
        for(int i=1;i<=noofbookings;i++)
        {
            
        }
        
    }
}
