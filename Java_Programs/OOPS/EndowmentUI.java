package OOPS;

import java.util.Scanner;

public class EndowmentUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Endowment ID: ");
        String endowmentID = sc.next();

        System.out.println("Enter Holder name: ");
        String holderName = sc.next();

        System.out.println("Enter Endowment Type: ");
        String endowmentType = sc.next();

        if(endowmentType.equalsIgnoreCase("Educational"))
        {
            System.out.println("Enter Registration Date: ");
            String registrationDate = sc.next();

            System.out.println("Enter Educational Institution: ");
            String educationalInstitute = sc.next();

            System.out.println("Enter Educational Division");
            String educationalDivision = sc.next();

            EducationalEndowment e = new EducationalEndowment(endowmentID, holderName, endowmentType, registrationDate, educationalInstitute, educationalDivision);
            System.out.printf("Endowment Amount: %.2f" , e.calculateEndowment());
        }

        else if(endowmentType.equalsIgnoreCase("Health"))
        {
            System.out.println("Enter Registration Date: ");
            String registrationDate = sc.next();

            System.out.println("Enter Health Care Center: ");
            String healthcareCenter = sc.next();

            System.out.println("Holder Age");
            int holderAge = sc.nextInt();

            HealthEndowment he = new HealthEndowment(endowmentID, holderName, endowmentType, registrationDate, healthcareCenter, holderAge);
            System.out.printf("Endowment Amount: %.2f" , he.calculateEndowment());
        }

        else{
            System.out.println(endowmentType+" is an invalid endowment type");
            sc.close();
        }
    }
}
