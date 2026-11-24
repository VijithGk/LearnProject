package OOPS;

public class EmployeeUI 
{
    public static void main(String[] args) 
    {
        RegularEmployee rEmployee = new RegularEmployee("Vijith", "2320770", 11000);

        Contractor contractor = new Contractor("Vinny", "2208005", 100000);

        System.out.println("------------Regular Employee------------"+"\nEmployee Name: "+rEmployee.getName()+" \nEmployee ID: "+rEmployee.getEmployeeID()+" \nBase Salary: "+rEmployee.getBaseSalary()
                            +" \nTotal Salary: "+rEmployee.calculateSalary());

        System.out.println("------------Contractor------------"+"\nEmployee Name: "+contractor.getName()+" \nEmployee ID: "+contractor.getEmployeeID()+" \nBase Salary: "+contractor.getBaseSalary()
                            +" \nTotal Salary: "+contractor.calculateSalary());
    }
}
