package ArrsStrings;

import java.util.Scanner;

public class wordSentence 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String firstSentence = sc.nextLine();

        String []splitSentence = firstSentence.split(" ");
        
        System.out.println("Enter the word");
        String inputWord = sc.nextLine();
        int count = 0;
        for(String a : splitSentence)
        {
            if(a.equalsIgnoreCase(inputWord))
            {
                count = 1;
                break;
            }
            else{
                count = 0;
            }
        }
        if(count>0)
        {
            System.out.println(inputWord+ " is present in the sentence");
        }
        else{
            System.out.println(inputWord+ " is not present in the sentence");
        }
        
    }
}
