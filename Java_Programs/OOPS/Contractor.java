package OOPS;

public class Contractor extends Employee
{
    public Contractor(String name, String employeeID, double baseSalary)
    {
        super(name, employeeID, baseSalary);
    }

    @Override
    public double calculateSalary()
    {
        double base = getBaseSalary();
        double salary = base + (base * 0.10);
        return salary;
        
    }
}
