package OOPS;

import java.util.Scanner;

public class WrordSummarizerUI 
{
    public static WordSummarizer calculateAsciiSum()
    {
        
        WordSummarizer w = (s)-> 
        {
            int asci=0;
            for(int i=0;i<s.length();i++){
                asci += (int) s.charAt(i);
            }
            if(asci%2==0)
            {
                return s+" is a perferct word";
            }
            else
            {
                return s+" is not a perfect word";
            }
        };return w;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to find the sum: ");
        String input = sc.next();

        if(!input.matches("[a-zA-Z]+"))
        {
            System.out.println(input+" is an invalid word");
        }else{
            WordSummarizer wSummarizer = calculateAsciiSum();
            String res = wSummarizer.summarize(input);
            System.out.println(res);
        }sc.close();
    }
}
