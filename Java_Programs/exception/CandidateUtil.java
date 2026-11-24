package exception;

public class CandidateUtil 
{
    public static boolean validateCandidateDetails(String name, String gender, double expectedSalary) throws CustomException
    {
        boolean flag = false;
        if (name != null && name.matches("^[A-Za-z]+$"))
        {
            flag = true;
        }else{
            throw new CustomException("The candidate name "+name+" is invalid");
        }
        if(gender != null && gender.equals("Male") || gender.equals("Female"))
        {
            flag = true;
        }else{
            throw new CustomException("The candidate gender is case sensitive please check again");
        }
        if(expectedSalary >= 20000)
        {
            flag = true;
        }else{
            throw new CustomException("The candidate salary is not meeting the minimum requirement");
        }
        return flag;
    }
}
