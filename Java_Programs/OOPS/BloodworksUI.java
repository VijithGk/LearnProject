package OOPS;

import java.util.Scanner;

public class BloodworksUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name = sc.nextLine();

        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        
        System.out.println("Enter the Gender: ");
        String gender = sc.next();

        System.out.println("Enter the blood group: ");
        String bloodGroup = sc.next();

        System.out.println("Enter the phone number: ");
        long phoneNumber = sc.nextLong();

        BloodworksNorthwest bw = new BloodworksNorthwest(name, age, gender, bloodGroup, phoneNumber);

        System.out.println(bw.toString());

    }
}
