package exception;

import java.util.Scanner;

public class CandidateUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the candidate name: ");
        String name = sc.nextLine();

        System.out.println("Enter Candidate gender: ");
        String gender = sc.nextLine();

        System.out.println("Enter Candidate expected salary: ");
        double expectedSalary = sc.nextDouble();

        try
        {
            boolean isValid = CandidateUtil.validateCandidateDetails(name, gender, expectedSalary);
            if(isValid)
            {
                System.out.println("The details of candidate " + name + " have been registered successfully");
            }
        }catch(CustomException e)
        {
            System.out.println(e.getMessage());
            sc.close();
        }


    }
}
