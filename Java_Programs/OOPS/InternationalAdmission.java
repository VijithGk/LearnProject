package OOPS;

public class InternationalAdmission extends Admission
{

    public InternationalAdmission(double gPA, double englishProficiencyScore) {
        super(gPA, englishProficiencyScore);
        
    }
    @Override
    public String admissionEvaluation()
    {
        if (getGPA()>=3.5 && englishProficiencyScore>=80 ) 
        {
            return "Applicant is Eligible for Application";    
        }
        else{
            return "Applicant is not Eligible as the GPA is lesser than 3.5 or English Proficiency Score is less than 80";
        }
    }

    
}
