package exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem1 
{
    public String getDuplicateElement()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
        
            System.out.println("Enter the size of the array: ");
            int arraySize = sc.nextInt();

            int arr[] = new int[arraySize];

            System.out.println("Enter the array elemets: ");
            for(int i=0;i<arraySize;i++)
            {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter the poition of the element to be replicated");
            int replicateIndex = sc.nextInt();
            
            int element = arr[replicateIndex];

            StringBuilder result = new StringBuilder();

            result.append("The Result array is: ");
            for (int i = 0; i < arraySize; i++) {
                result.append(arr[i]).append(" ");
            }

            result.append(element);
            return result.toString();

        }catch(ArrayIndexOutOfBoundsException e)
        {
            return "Array index is out of range";
        }
        catch(InputMismatchException e)
        {
            return "Input was not in the correct format";
        }
        catch (NegativeArraySizeException e) {
            return "Array size should be positive";
        }
    }
    public static void main(String[] args) 
    {
        Problem1 problem1 = new Problem1();
        System.out.println(problem1.getDuplicateElement());
    }
}
