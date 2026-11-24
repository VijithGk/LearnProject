package ArrsStrings;

import java.util.Arrays;
import java.util.Scanner;

public class findWinner 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of teams: ");
        int noOfTeams = sc.nextInt();

        if(noOfTeams>=2)
        {
            System.out.println("Enter the details: ");

            for(int i=0;i<noOfTeams;i++)
            {
                
                String userInput = sc.nextLine();
                
                String []splitArray = userInput.split(":");
                String teamName = splitArray[0];
                float timeByMem1 = Float.parseFloat(splitArray[1]);
                float timeByMem2 = Float.parseFloat(splitArray[2]);
                float timeByMem3 = Float.parseFloat(splitArray[3]);
                float timeByMem4 = Float.parseFloat(splitArray[4]);
                
                if(!(timeByMem1<1 && timeByMem2<1 && timeByMem3<1 && timeByMem4<1))
                {

                }
            }
            
            
        }
    }
}
