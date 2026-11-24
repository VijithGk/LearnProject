package Collections;

import java.util.Scanner;

public class TreeSetUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        NumAvg numAvg = new NumAvg();
        int choice;
        int num = 0;
        
        do{
            System.out.println("1.Add number\n2.Find average\n3.Exit\nEnter your choice");
            choice = sc.nextInt();
            switch (choice) {
                
                case 1:
                    System.out.println("Enter the number: ");
                    num = sc.nextInt();
                    numAvg.addNum(num);
                    break;
                case 2: if(numAvg.getNumSet().isEmpty())
                        System.out.println("The set is empty");
                        else
                            System.out.println(numAvg.calAvg());
                    
                    System.out.println("Enter the number: ");
                    numAvg.addNum(num);
                    break;
                case 3:
                    System.out.println("Thanks for using the application!");
                    //sc.close();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice != 3);

        sc.close();
    }
}
