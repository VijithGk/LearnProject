package Collections;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeUI 
{
    public static void main(String[] args) throws InputMismatchException
    {
        Scanner sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

        try
        {
            while(true)
            {
                System.out.println("\n----Employee Management System----");
                System.out.println("Select any option from below Menu");
                System.out.println("\n1. Add an Employee");
                System.out.println("\n2. Search an Employee by ID");
                System.out.println("\n3. View all Employees");
                System.out.println("\n4. Update Skill by Employee ID");
                System.out.println("\n5. Delete Employee details by Employee ID");
                System.out.println("\n6. Get Employee with Maximum Experience");
                //int choice = Integer.parseInt(sc.next());

                if(!sc.hasNextInt()) 
                {
                    System.out.println("Please enter a valid number.");
                    sc.next();
                    continue;
                }
                int choice = sc.nextInt();

                switch(choice)
                {
                    case 1:
                        System.out.println("\nEnter number of Employees to be added");
                        int num = sc.nextInt();
                        if(num>0)
                        {
                            for(int i=0;i<num;i++)
                            {
                                System.out.println("\nEnter employee details");
                                String userInput = sc.next();

                                Employee employee = EmployeeUtil.parseInput(userInput);
                                if(!(employee == null))
                                {
                                    employeeService.addEmployee(employee);
                                    System.out.println("\nEmployee was added successfully\n");
                                }
                                else
                                {
                                    throw new InputMismatchException("Please enter valid details");
                                }
                            }
                            
                        }else
                        {
                            System.out.println("Number of employees to be added should be greater than 0");
                        }
                        break;
                    
                    case 2:
                        System.out.println("\nEnter the employee ID to be searched on the database: ");
                        String empId = sc.next();
                        if(employeeService.getEmployeebyID(empId)==null)
                        {
                            System.out.println("\nNo Employee found with the Employee ID: "+empId);
                        }
                        else
                        {
                            System.out.println("\nData was found: "+employeeService.getEmployeebyID(empId));
                        }
                        break;

                    case 3:
                        System.out.println(employeeService.getSet());
                        break;
                    
                    case 4:
                        System.out.println("Enter the number of Employyes's skill to be updated: ");
                        int numSkill = sc.nextInt();

                        if(!(numSkill>0))
                        {
                            System.out.println("Enter number greater than 0");
                            continue;
                        }else
                        {
                            for(int i=0;i<numSkill;i++)
                            {
                                System.out.println("Enter the Employee Id and Skill to be updated");
                                String empId1 = sc.next();
                                String skill = sc.next();

                                if(employeeService.updateEmployeeSkill(empId1, skill))
                                {
                                    System.out.println("\nSkill was updated for the Employee ID "+empId1);
                                }
                                else{
                                    System.out.println("Employee ID was not found");
                                }
                            }
                        }
                    case 5:
                        System.out.println("Enter number of employees to be deleted");
                        int numEmp = sc.nextInt();

                        for(int i=0;i<numEmp;i++)
                        {
                            System.out.println("Enter the Employee ID to be deleted: ");
                            String empID = sc.next();
                            if(EmployeeUtil.validate(empID))
                            {
                                employeeService.deleteEmployeeID(empID);
                            }
                            else{
                                System.out.println("Enter a valid Employee ID");
                            }
                        }break;

                    case 6:
                        System.out.println("\nFetching the employee with Maximum Experience...");
                        if(employeeService.getEmpMaxExp()==null)
                        {
                            System.out.println("\nNo Employees are added to the database!");
                        }else
                        {
                            System.out.println(employeeService.getEmpMaxExp());
                        }
                }
            }
            

        }catch(InputMismatchException e)
        {
            System.out.println("Error: "+e.getMessage());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: "+e.getMessage());
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Error: "+e.getMessage());
        }

    }
}
