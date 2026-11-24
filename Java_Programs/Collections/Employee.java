package Collections;

public class Employee
{
    private String employeeID;
    private String employeeName;
    private String skill;
    private double experience;
    
    public Employee(String employeeID, String employeeName, String skill, double experience) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.skill = skill;
        this.experience = experience;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((employeeID == null) ? 0 : employeeID.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (employeeID == null) {
            if (other.employeeID != null)
                return false;
        } else if (!employeeID.equals(other.employeeID))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "\nEmployee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", skill=" + skill
                + ", experience=" + experience + "]\n";
    }

    
}