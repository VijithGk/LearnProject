import java.util.Scanner;

public class smallestNumber {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Outer:
        {
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();        
        int c = sc.nextInt();        

        if (a==b && b==c) 
        {
            System.out.println("All numbers are equal!");
            break Outer;
        }

        boolean aa = (a<b&&a<c)?true:false;
        if (aa==true) {
            System.out.println("The smallest number is "+a);
        }
        else{
            boolean bb = (b<c)?true:false;
            if (bb==true) 
            {
                System.out.println("The smallest number is "+b);    
            }
            else{
                System.out.println("The smallest number is "+c);
            }
        }
        }
    }
}
