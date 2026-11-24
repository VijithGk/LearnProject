package OOPS;

import java.util.Scanner;

public class AdmissionUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of Applicatnt \n1.Regular\n2.International");
        int choice = sc.nextInt();
        Admission admission;
        System.out.println("Enter the GPA: ");
        double GPA = sc.nextDouble();

        System.out.println("Enter the English Proficiency score: ");
        double score = sc.nextDouble();

        if(choice==1)
        {
            admission = new Admission(GPA, score);
            System.out.println(admission.admissionEvaluation());
        }

        else if(choice==2)
        {
            admission  = new InternationalAdmission(GPA, score);
            System.out.println(admission.admissionEvaluation());
        }
        else
            System.out.println("Incorrect input");
        sc.close();
    }
}
