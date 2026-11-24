package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeatherMonitor 
{
    public static void main(String[] args) 
    {
        double dailyTemperature[] = new double[7];
        double sum=0;
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Enter the Temperature for 7 Days: ");

            for(int i=0;i<dailyTemperature.length;i++)
            {
                while (true) 
                {
                    try
                    {
                        System.out.print("Day "+(i+1)+": ");
                        dailyTemperature[i] = sc.nextDouble();
                        sum += dailyTemperature[i];
                        break;
                    }catch(InputMismatchException e)
                    {
                        System.out.println("Enter a valid temperature!");
                        sc.next();
                    }
                    
                }
                
                double avg = sum/dailyTemperature.length;
                System.out.printf("Average Temperature is %.2f°C", avg);
                while (true) 
                {
                    try
                    {
                        System.out.print("Enter the day to fetch the temperature: ");
                        int day = sc.nextInt();
                        if(day<1 || day>7)
                        {
                            throw new IllegalArgumentException("Enter a valid day between Day 1 to Day 7!");
                        }else{
                            System.out.println("The Temperature of day "+day+": "+dailyTemperature[day-1]);
                            break;
                        }
                    }catch(InputMismatchException e)
                    {
                        System.out.println("Invalid input! Please enter a valid integer.");
                        sc.next();
                    }catch(IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                }
            }
            
        }catch(Exception e)
        {
            System.out.println("Something went wrong please try again");
        }
        finally{
            System.out.println("Thank you for using the application!");
            sc.close();
        }
    }
        
}