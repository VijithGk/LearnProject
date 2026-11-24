package OOPS;

public class Admission 
{
    private double GPA;
    protected double englishProficiencyScore;
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double gPA) {
        GPA = gPA;
    }
    public double getEnglishProficiencyScore() {
        return englishProficiencyScore;
    }
    public void setEnglishProficiencyScore(double englishProficiencyScore) {
        this.englishProficiencyScore = englishProficiencyScore;
    }

    public Admission(double gPA, double englishProficiencyScore) {
        GPA = gPA;
        this.englishProficiencyScore = englishProficiencyScore;
    }

    public String admissionEvaluation()
    {
        if(GPA>=3.0)
        {
            return "Applicant is Eligible for Application";
        }
        else{
            return "Applicant is not Eligible as the GPA is lesser than 3.0";
        }
    }
    
    
}
