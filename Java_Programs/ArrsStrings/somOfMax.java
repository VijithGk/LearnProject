package ArrsStrings;

import java.util.Arrays;
import java.util.Scanner;

public class somOfMax 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int arrSize = sc.nextInt();

        if(arrSize<=0)
        {
            System.out.println(arrSize+" is an invalid array size");
        }
        else if (arrSize%2!=0)
        {
            System.out.println(arrSize+" is an odd number. Please enter even number");    
        }
        else
        {
            int arr[] = new int[arrSize];
            System.out.println("Enter the number");

            for(int i=0;i<arrSize;i++)
            {
                int num = sc.nextInt();
                arr[i] = num;
            }
            Arrays.sort(arr);
            int i =0;
            int j = arrSize-1;
            int maxSum = Integer.MIN_VALUE;

            while(i<j)
            {
                int sum = arr[i]+arr[j];
                if(sum > maxSum)
                {
                    maxSum = sum;
                }

                i++;
                j--;
            }
            System.out.println("The Maximum number is: "+maxSum);
        }
        sc.close();
    }
}
