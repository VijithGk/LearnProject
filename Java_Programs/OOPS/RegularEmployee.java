package OOPS;

public class RegularEmployee extends Employee
{

    public RegularEmployee(String name, String employeeID, double baseSalary) 
    {
        super(name, employeeID, baseSalary);
    }

    @Override
    public double calculateSalary()
    {
        double base = getBaseSalary();
        double salary = base + (base * 0.02) - (base * 0.03) - (base * 0.05);
        return salary;
    }
    
}
