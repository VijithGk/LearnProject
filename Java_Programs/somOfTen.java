import java.util.Scanner;

public class somOfTen 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int userInput = sc.nextInt();
        int sum = 0;
        for(int i=userInput;i<=(userInput+9);i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}
