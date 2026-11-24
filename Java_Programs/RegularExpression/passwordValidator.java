package RegularExpression;

import java.util.Scanner;

public class passwordValidator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");

        String password = sc.next();
        String passMatch = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$*])[A-Za-z0-9@#$*]{6,12}$";
    }
}
