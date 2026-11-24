import java.util.Scanner;

public class FitnessUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter user name: ");
        String name = sc.next();
        sc.next();

        System.out.println("Enter weight in kgs: ");
        double weight = sc.nextDouble();

        System.out.println("Enter number of steps taken: ");
        int stepsTaken = sc.nextInt();

        System.out.println("Enter distance covered in km: ");
        double distance = sc.nextDouble();

        System.out.println("Is the user running?(true/false)");
        boolean isRunning = sc.nextBoolean();

        UserFitnessData uData = new UserFitnessData(name, weight, stepsTaken, distance, isRunning);
        
        String fitnessLevel = uData.calculateFitnessLevel();
        double caloriesBurnt = FitnessMonitor.calculateCaloriesBurnt(weight, distance, isRunning);

        System.out.println("UserName: "+name+" Weight: "+weight+" Steps Taken: "+stepsTaken+" Distance Covered: "+distance+" Running: "+isRunning+" Fitness Level: "+fitnessLevel+" Calories Burnt: "+caloriesBurnt);
    }
}
