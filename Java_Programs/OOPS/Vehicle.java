package OOPS;

public abstract class Vehicle 
{
    protected String vehicleID;
    protected String brand;
    protected double dailyBaseRate;

    

    public Vehicle(String vehicleID, String brand, double dailyBaseRate) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.dailyBaseRate = dailyBaseRate;
    }

    public String getVehicleID() {
        return vehicleID;
    }
    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getDailyBaseRate() {
        return dailyBaseRate;
    }
    public void setDailyBaseRate(double dailyBaseRate) {
        this.dailyBaseRate = dailyBaseRate;
    }

    public abstract double calculateDailyRate();   

    public double calculateTotalCost(int days)
    {
        return calculateDailyRate()*days;
    }    
    public void displayVehicleInfo(int days)
    {
        System.out.println("Vehicle ID: "+vehicleID+"\nVehicle Name: " +brand+"\nBase Rate: "+dailyBaseRate+"\nDays: "+days);
    }   

    
}
