package Collections;
import java.util.Scanner;

public class StudentUI 
{
    public static void main(String[] args) throws NumberFormatException
    {
        Scanner sc = new Scanner(System.in);
        StudentMarksManager sMarksManager = new StudentMarksManager();
        try
        {
            while(true)
            {
                System.out.println("----Student Marks Management System----");
                System.out.println("Enter the operation to be executed by seclecting a number from below:");
                System.out.println("1. Add Marks");
                System.out.println("2. View All Marks");
                System.out.println("3. Update a specific Mark");
                System.out.println("4. Get the Highest Mark");
                System.out.println("5. Get the Average Mark");
                System.out.println("6. Delete the Mark by Index");
                System.out.println("9. Exit the application");

                int choice = Integer.parseInt(sc.next());
                
                switch(choice){
                    case 1:
                        System.out.println("Enter the count of marks to be added");
                        int count = Integer.parseInt(sc.next());         

                        for(int i=0;i<count;i++)
                        {
                            System.out.println("Enter mark to add");
                            double marks = sc.nextDouble();
                            sMarksManager.addMarks(marks);
                        }
                        break;
                    
                    case 2:    
                        if(sMarksManager.getList().isEmpty())
                        {
                            System.out.println("List is empty!\n");
                        }else{
                            System.out.println("\nViewing all marks: ");
                            System.out.println(sMarksManager.getList());
                        }break;
                    
                    case 3:
                        System.out.println("Enter the old mark to be udpated");
                        double oldMark = Double.parseDouble(sc.next());

                        System.out.println("Enter the new mark to be udpated");
                        double newMark = Double.parseDouble(sc.next());

                        if(!(StudentUtil.validateMarks(oldMark) && StudentUtil.validateMarks(newMark)))
                        {
                            System.out.println("Marks should be between 0 to 100");
                        }
                        else
                        {
                            System.out.println("Number of marks updated from "+oldMark+" to new marks "+newMark+" is: "
                            +sMarksManager.updateSpecificMark(oldMark, newMark));
                        }break;
                    
                    case 4:
                        System.out.println("Getting the Highest Marks...");
                        System.out.println(sMarksManager.getHighestMarks());
                        break;

                    case 5:
                        System.out.println("Getting the average Marks... ");
                        System.out.println(sMarksManager.getAverageMarks());
                        break;

                    case 6:
                        System.out.println("Enter the index of the marks to be deleted: ");
                        int index = Integer.parseInt(sc.next());
                        if(sMarksManager.deleteMarks(index))
                        {
                            System.out.println("Marks was deleted from the list");
                        }
                        else
                        {
                            System.out.println("Invlaid Index");
                            
                        }break;
                    case 9:
                        System.out.println("Thanks for using the application");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                    
                }

            }
            
        }catch(NumberFormatException e)
        {
            System.out.println("Invalid Input!!");
        }
    }
    
}
