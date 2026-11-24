import java.util.Scanner;

public class lotteryWinner 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ticket ID");
        long ticketID = sc.nextLong();
        
        System.out.println("Enter the unlucky code");
        int unluckyCode = sc.nextInt();

        int count = 0;
        int iter = String.valueOf(ticketID).length();
        long temp = ticketID;

        for(int i=0;i<iter;i++)
        {
            int digit = (int) temp%10;
            if (digit == unluckyCode) 
            {
                count += 1;    
            }
            temp = temp/10;
        }

        if (count == 0) 
        {
            System.out.println(ticketID+" is lucky ticket");    
        }
        else if(count>0 && count<3)
        {
            System.out.println(ticketID+" is partially lucky");    
        }
        else
        {
            System.out.println(ticketID+" is unlucky ticket");
        }
    }
}
