package ArrsStrings;

import java.util.Scanner;

public class findLetters 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word: ");
        String userInput = sc.next();

        int wordLength = userInput.length();
        
        System.out.println("Enter two indices: ");
        int firstIndice = sc.nextInt();
        while (true) 
        {
            if (firstIndice>wordLength) 
            {
                System.out.println(firstIndice+" is greater than the word length");
                break; 
            }
            else
            {
                break;
            }
        }
        int secondIndice = sc.nextInt();

        if(secondIndice>wordLength)
        {
            System.out.println(secondIndice+" is greater than the word length");
            sc.close(); 
        }
        else if(secondIndice<firstIndice)
        {
            System.out.println("Index2 should be greater than Index1");
        }
        else
        {
            System.out.println(userInput.substring(firstIndice, secondIndice));
        }

    }
}
