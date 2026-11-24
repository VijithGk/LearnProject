package OOPS;

public class Employee 
{
    private String name;
    private String employeeID;
    private double baseSalary;

    public Employee(String name, String employeeID, double baseSalary) 
    {
        super();
        this.name = name;
        this.employeeID = employeeID;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return 0;
    }
}
