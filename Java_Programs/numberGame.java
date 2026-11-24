import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int userInput = sc.nextInt();
        int temp = userInput;
        int reversedNum = 0;
        int expandedNum = 0;

        if ((userInput/1000)<1) 
        {
            System.out.println(userInput+" is an invalid number");    
        }
        
        else
        {
            int i = String.valueOf(userInput).length();

            while (temp > 0)
            {
                int digit = temp % 10;
                reversedNum = reversedNum * 10 + digit;

                switch (i) {
                    case 4:
                        expandedNum = digit * 1000;
                        break;
                    case 3:
                        expandedNum = digit * 100;
                        break;
                    case 2:
                        expandedNum = digit * 10;
                        break;
                    case 1:
                        expandedNum = digit * 1;
                        break;
                    default:
                        expandedNum = 0;
                }

                System.out.println(expandedNum);

                temp = temp / 10;
                i--;
            }

            System.out.println(reversedNum);
        }
    }
}