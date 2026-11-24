package ArrsStrings;

import java.util.Scanner;

public class twoArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size for the first array: ");
        int arrSize1 = sc.nextInt();

        int arr1[] = new int[arrSize1];
        System.out.println("Enter the elements for the first array: ");
        for(int i=0;i<arrSize1;i++)
        {
            int nums1 = sc.nextInt();
            arr1[i] = nums1;
        }

        System.out.println("Enter the size for the second array: ");
        int arrSize2 = sc.nextInt();

        int arr2[] = new int[arrSize2];
        System.out.println("Enter Elements of second array: ");
        for(int i=0;i<arrSize2;i++)
        {
            int nums2 = sc.nextInt();
            arr2[i] = nums2;
        }
        if(!(arrSize1==arrSize2))
        {
            if(arrSize2<0)
            {
                System.out.println(arrSize2+" is an invalid array size");
            }
            System.out.println("Both array size are not same");
        }
        else
        {
            System.out.println("The elements of third array: ");
            for(int i=0;i<arrSize1;i++)
            {
                if(i==0 || i%2==0)
                {
                    System.out.println(arr1[i]+arr2[i]);
                }
                else
                {
                    System.out.println(arr1[i]-arr2[i]);
                }
            }
        } 
    }
    
}
