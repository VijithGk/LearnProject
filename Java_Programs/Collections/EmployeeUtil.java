package Collections;

public class EmployeeUtil 
{
    public static Employee parseInput(String input)
    {
        String userInput[] = input.split(":");

        String employeeID = userInput[0];
        String employeeName = userInput[1];
        String employeeSkill = userInput[2];
        double experience = Double.parseDouble(userInput[3]);

        if(validate(employeeID))
        {
            return new Employee(employeeID, employeeName, employeeSkill, experience);
        }
        else
            return null;
    }

    public static boolean validate(String employeeID) 
    {
        String pattern = "^TEK\\d{3}$";
        if(employeeID.matches(pattern))
        {
            return true;
        }
        else
            return false;
    }
}
