package OOPS;

import java.util.Scanner;

public class userInterface 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // INPUT
        System.out.println("Enter Student's ID: ");
        int studentId = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("Enter Student's Name: ");
        String studentName = sc.nextLine();

        System.out.println("Enter Student's Address: ");
        String studentAddress = sc.nextLine();

        // VALIDATION LOOP for Yes/No
        String choice;
        while (true) 
        {
            System.out.println("Whether the student from NIT(Yes/No): ");
            choice = sc.next();

            if (choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("No")) 
            {
                break;
            } 
            else 
            {
                System.out.println("Wrong input! Please enter Yes or No.");
            }
        }

        // OBJECT CREATION
        studentDetails sd;

        if (choice.equalsIgnoreCase("Yes")) 
        {
            sd = new studentDetails(studentId, studentName, studentAddress);
        } 
        else 
        {
            sc.nextLine(); // clear buffer
            System.out.println("Enter College Name: ");
            String collegeName = sc.nextLine();

            sd = new studentDetails(studentId, studentName, studentAddress, collegeName);
        }

        // OUTPUT
        System.out.println("\n--- Student Details ---");
        System.out.println("Student ID: " + sd.getStudentID());
        System.out.println("Student Name: " + sd.getStudentName());
        System.out.println("Student Address: " + sd.getStudentAddress());
        System.out.println("College Name: " + sd.getCollegeName());
    }
}