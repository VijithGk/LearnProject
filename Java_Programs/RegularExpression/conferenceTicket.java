package RegularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

import ArrsStrings.twoArray;

public class conferenceTicket 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = sc.nextLine();

        System.out.println("Enter the ticket number: ");
        String ticketNumber = sc.next();

        String matchString = "[S][P][C][0-9]{3}[0-9]{2}[A-Z]{2}";
        if (Pattern.matches(matchString, ticketNumber)) 
        {
            int time = Integer.parseInt(ticketNumber.substring(6, 8));
            String timeZone = ticketNumber.substring(8);
            if(time>0 && time<=12 && (timeZone.equals("PM")||
            timeZone.equals("AM")))
                {
                    System.out.println("Hi "+userName+" your event starts at "+time+timeZone);
                }
                else{
                    System.out.println("NaN");
                } 
        }
    }
}
