package Collections;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumSetUI 
{
    public static void main(String[] args) throws InputMismatchException, NumberFormatException, ArithmeticException
    {
        Scanner sc = new Scanner(System.in);
        NumSetManager nManager = new NumSetManager();

        while(true)
        {
            System.out.println("----QuickCompute - Number Management Application----");
            System.out.println("\n1. Add Number");
            System.out.println("2. View all Numbers");
            System.out.println("3. Update Number");
            System.out.println("4. Delete Number");
            System.out.println("5. View Numbers Greater than a Value");
            System.out.println("6. Calculate Average");
            System.out.println("7. Exit the Application");

            try
            {
                int choice = Integer.parseInt(sc.next());
                if(choice<=0 || choice>7)
                {
                    System.out.println("\nSelect a Valid Number!");
                    continue;
                }
                else
                {
                    switch(choice)
                    {
                        case 1:
                            System.out.println("\nHow many numnbers to be added?");
                            int numOfNums = Integer.parseInt(sc.next());
                            for(int i=0;i<numOfNums;i++)
                            {
                                System.out.println("\nEnter a number: ");
                                int addNum = sc.nextInt();
                                nManager.addNumber(addNum);
                            }
                        break;

                        case 2:
                            System.out.println("Viewing all Numbers that are Stored...");
                            System.out.println(nManager.viewAllNumbers());
                            break;
                        
                        case 3:
                            System.out.println("Enter the old number to be updated: ");
                            int oldNum = Integer.parseInt(sc.next());
                            System.out.println("Enter the New Number: ");
                            int newNum = Integer.parseInt(sc.next());
                            if(nManager.updateNumber(oldNum, newNum))
                            {
                                System.out.println("Number was updated Successfully\nOld Num: "+oldNum+"\nNew Number is: "+newNum);
                            }
                            else
                            {
                                System.out.println("Old Number is not present in the database");
                            }
                            break;
                        
                        case 4:
                            System.out.println("Enter the number to be deleted: ");
                            int num = Integer.parseInt(sc.next());

                            if(nManager.deleteNumber(num))
                            {
                                System.out.println(num+" was deleted successfully");
                            }
                            else
                            {
                                System.out.println("Number was not found in the database");
                            }
                            break;
                        case 5:
                            System.out.println("Enter the Value");
                            int numDel = Integer.parseInt(sc.next());
                            if(nManager.viewGreaterNum(numDel).isEmpty())
                            {
                                System.out.println("No number was greter than the value");
                            }else
                            {
                                System.out.println("Numbers greater than the value are: "+nManager.viewGreaterNum(numDel));
                            }
                            break;
                        
                        case 6:
                            System.out.println("Calculating the average of all numbers");
                            System.out.println("The average of all numbers are: "+nManager.calculateAverage());
                            break;

                        case 7:
                            System.out.println("Thanks for using the application");
                            System.exit(0);
                    }
                }
            }catch(InputMismatchException e)
            {
                System.out.println("Error: "+e.getMessage());
            }
            catch(NumberFormatException e)
            {
                System.out.println("Error: "+e.getMessage());
            }
            catch(ArithmeticException e)
            {
                System.out.println("Error: "+e.getMessage());
            }
        }
    }
}
