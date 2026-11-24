import java.util.Scanner;

public class simCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the phone number");

        long phoneNumber = scanner.nextLong();
        int digit = 0;
        int evenSum = 0;
        int oddSum = 0;

        long temp = phoneNumber;
        for(int i = 0; i<=10; i++)
        {
            digit = (int) temp%10;
            if (digit%2==0) 
            {
                evenSum+= digit;
            }
            else{
                oddSum+= digit;
            }
            temp = temp/10;
        }
        
        if(evenSum==oddSum){
            System.out.println("Sum of even and odd are equal");
        }
        else if(oddSum>evenSum){
            System.out.println("Sum of odd is greater than sum of even");
        }
        else if(evenSum>oddSum){
            System.out.println("Sum of even is greater than sum of odd");
        }
        }
}

