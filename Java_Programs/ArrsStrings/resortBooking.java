package ArrsStrings;

import java.util.Arrays;
import java.util.Scanner;

public class resortBooking 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the customer details: ");

        String userInput = sc.nextLine();
        //System.out.println(userInput);
        
        String customerName;
        int adultCount;
        int childCount;
        int noOfDays;

        String a[] = userInput.split(":");
        customerName = a[0];
        adultCount = Integer.parseInt(a[1]);
        childCount = Integer.parseInt(a[2]);
        noOfDays = Integer.parseInt(a[3]);

        
        // System.out.println("Customer Name: "+customerName+
        //     " \nNo of Adults: "+adultCount+
        //     " \nNo of Childern: "+childCount+
        //     " \nNo of Days: "+noOfDays
        // );

        int totalBill=0;
        int adultTotal=0;
        int childTotal=0;
        if(adultCount<0)
        {
            System.out.println("Invalid input for number of adults");
            sc.close();
        }
        else{
            adultTotal = adultCount*1000;
        }
        if(childCount<0)
        {
            System.out.println("Invliad input for number of childern");
        }else{
            childTotal = childCount*650;
        }
        if(noOfDays<=0)
        {
            System.out.println("Invalid input for number of days");
        }
        else
        {
            totalBill = (adultTotal+childTotal)*noOfDays;
            System.out.println(customerName+" your booking is confirmed and total cost is "+totalBill);
        }

        
        

    }

    
}
