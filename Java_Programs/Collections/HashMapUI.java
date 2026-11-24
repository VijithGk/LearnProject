package Collections;

import java.util.Scanner;

public class HashMapUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Country country = new Country();
        int choice = 0;

        do {
            System.out.println("1.Add\n2.Search\n3.Exit");
            System.out.println("Enter your choice");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter country name:");
                    String cName = sc.nextLine();

                    System.out.println("Enter capital name:");
                    String capName = sc.nextLine();

                    country.add(cName, capName);
                    break;

                case 2:
                    if (country.getCountryMap().isEmpty()) {
                        System.out.println("The map is empty");
                    } else {
                        System.out.println("Enter country name:");
                        String searchName = sc.nextLine();

                        String result = country.search(searchName);
                        System.out.println(result);
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the application");
                    break;

                default:
                    System.out.println("Invalid Input");
            }

        } while (choice != 3);

        sc.close();
    }
}