package OOPS;

public class Bike extends Vehicle
{
    public Bike(String vehicleID, String brand, double dailyBaseRate)
    {
        super(vehicleID, brand, dailyBaseRate);
    }
    
    public double calculateDailyRate()
    {
        return getDailyBaseRate() - (getDailyBaseRate()*0.15);
    }

}
