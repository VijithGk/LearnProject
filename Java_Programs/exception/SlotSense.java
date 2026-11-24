package exception;

public class SlotSense 
{
    public static void validation(int attendance, int slot) throws IllegalArgumentException, IllegalStateException, IndexOutOfBoundsException
    {
        if (attendance < 0 || attendance > 100) {
                 throw new IllegalArgumentException("Attendance must be between 0 and 100");
            }
    
            if (attendance < 75) {
                throw new IllegalStateException("Not eligible due to insufficient attendance");
            }
    
            if (slot < 1 || slot > 5) {
                throw new IndexOutOfBoundsException("Invalid slot number");
            }
    }
}
