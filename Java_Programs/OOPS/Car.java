package OOPS;

public class Car extends Vehicle
{
    public Car(String vehicleID, String brand, double dailyBaseRate)
    {
        super(vehicleID, brand, dailyBaseRate);
    }
    
    public double calculateDailyRate()
    {
        return getDailyBaseRate() + (getDailyBaseRate()*0.10);
    }
}
