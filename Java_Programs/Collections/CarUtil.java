package Collections;

public class CarUtil 
{
    public static boolean validateNumberPlate(String plate)
    {
        String pattern = "^[A-Z]{2}-\\d{2}-[A-Z]{2}-\\d{4}$";
        if(plate.matches(pattern))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
