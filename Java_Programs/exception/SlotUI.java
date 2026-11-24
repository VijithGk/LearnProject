package exception;

import java.util.Scanner;

public class SlotUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Details: ");
        
        String userInput[] = sc.nextLine().split(",");
        String studentID = userInput[0];
        int attendance = Integer.parseInt(userInput[1]);
        int slot = Integer.parseInt(userInput[2]);

        try{
            SlotSense.validation(attendance, slot);
            System.out.println("Student is alloted with the slot " + slot);
        }catch(IllegalArgumentException | IllegalStateException | IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            sc.close();
        }catch(Exception e)
        {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            sc.close();
        }

    }
}
