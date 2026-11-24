package ArrsStrings;

import java.util.Arrays;
import java.util.Scanner;

public class middleNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int arrSize = sc.nextInt();
        if(arrSize%2==0&&arrSize>0)
        {
            System.out.println("Please enter an odd number");
            sc.close();
        }
        else if(arrSize<=0 ||arrSize>10)
        {
            System.out.println("Please enter a valid number");
            sc.close();
        }
        else if(arrSize>0 && arrSize<=10)
        {
            System.out.println("Enter the elements: ");
            int arr[] = new int[arrSize];
            int add = 0;
            int multi = 1;
            boolean multiplied = false;
            for(int i=0;i<arrSize;i++)
            {
                int num = sc.nextInt();
                arr[i] = num;

            }

            int middleNum = (arrSize-1)/2;

            if(arr[middleNum] % 2 == 0)
            {
                for(int i = 0; i < arrSize; i++)
                {
                    if(i < middleNum)
                    {
                        add += arr[i];
                    }
                    if(i > middleNum)
                    {
                        multi *= arr[i];
                        multiplied = true;
                    }
                }
                System.out.println("The addition are: "+add);
                System.out.println("The multiples are: "+multi);
            }

            else{
                for(int i = 0; i < arrSize; i++)
                {
                    if(i < middleNum)
                    {
                        multi *= arr[i];
                        multiplied = true;
                    }
                    if(i > middleNum)
                    {
                        add += arr[i];
                    }
                    
                    if(!multiplied)
                    {
                        multi = 0;
                    }     
                }
                System.out.println("The addition are: "+add);
                System.out.println("The multiples are: "+multi);
            }
            
        }
    }
}
