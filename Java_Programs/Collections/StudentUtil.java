package Collections;


public class StudentUtil 
{
    public static boolean validateMarks(double marks)
    {
        if(marks<0 || marks>100)
        {
            return false;
        }
        else
            return true;
    }    
}
