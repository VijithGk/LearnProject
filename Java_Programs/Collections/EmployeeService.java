package Collections;
import java.util.HashSet;
import java.util.Set;

public class EmployeeService 
{
    private HashSet<Employee> set = new HashSet<>();

    public HashSet<Employee> getSet() {
        return set;
    }

    public void setSet(HashSet<Employee> set) {
        this.set = set;
    }
    
    public void addEmployee(Employee employee)
    {
        set.add(employee);
    }

    public Employee getEmployeebyID(String employeeID)
    {
        for(Employee s : set)
        {
            if(s.getEmployeeID().toLowerCase().matches(employeeID.toLowerCase()))
            {
                return s;
            }
        }
        return null;
    }

    public Set<Employee> viewAllEmployees()
    {
        if(set.isEmpty())
        {
            return null;
        }
        else{
            return set;
        }
    }

    public boolean updateEmployeeSkill(String employeeID, String skill)
    {
        if(employeeID.isEmpty() || skill.isEmpty())
        {
            System.out.println("Enter Valid details");
        }
        else{
            for(Employee s : set)
            {
                if(s.getEmployeeID().toLowerCase().matches(employeeID.toLowerCase()))
                {
                    s.setSkill(skill);
                    System.out.println("\nUpdated Skill is: "+s.getSkill());
                    return true;
                }
            }
        }
        return false;
    }

    public boolean deleteEmployeeID(String employeeID)
    {
        for(Employee s : set)
        {
            if(s.getEmployeeID().toLowerCase().matches(employeeID.toLowerCase()))
            {
                set.remove(s);
                System.out.println("Employee was deleted successfully!");
                return true;
            }
        }
        return false;
    }

    public Set<Employee> getEmpMaxExp()
    {
        Set<Employee> resultSet = new HashSet<>();
        double maxExp = Double.MIN_VALUE;

        for(Employee emp : set)
        {
            if(emp.getExperience() > maxExp)
            {
                maxExp = emp.getExperience();
                resultSet.clear();
                resultSet.add(emp);
            }
            else if(emp.getExperience() == maxExp)
            {
                resultSet.add(emp);
            }
        }

        return resultSet;
    }
}
