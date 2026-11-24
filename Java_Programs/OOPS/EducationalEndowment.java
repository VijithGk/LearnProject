package OOPS;

public class EducationalEndowment extends Endowment 
{

    private String educationalInstitution;
    private String educationalDivision;
    
    public EducationalEndowment()
    {
        super();
    }
    
    public EducationalEndowment(String endowmentID, String holderName, String endowmentType, String registrationDate, String educationalInstitution, String educationalDivision) 
    {
        super(endowmentID, holderName, endowmentType, registrationDate);
        this.educationalInstitution = educationalInstitution;
        this.educationalDivision = educationalDivision;
    }



    public String getEducationalInstitution() {
        return educationalInstitution;
    }



    public void setEducationalInstitution(String educationalInstitution) {
        this.educationalInstitution = educationalInstitution;
    }



    public String getEducationalDivision() {
        return educationalDivision;
    }



    public void setEducationalDivision(String educationalDivision) {
        this.educationalDivision = educationalDivision;
    }



    public double calculateEndowment()
    {
        double endowmentAmount=0;
        if(educationalDivision.equalsIgnoreCase("School"))
        {
            endowmentAmount = 30000.00;
        }
        else if(educationalDivision.equalsIgnoreCase("UnderGraduate"))
        {
            endowmentAmount = 60000;
        }
        else if(educationalDivision.equalsIgnoreCase("PostGraduate"))
        {
            endowmentAmount = 90000;
        }

        return endowmentAmount;
    }
}
