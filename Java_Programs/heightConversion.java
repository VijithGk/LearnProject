import java.util.Scanner;

public class heightConversion {
    
    public float showHeight(double heightInCm){
        float feet = (float)(heightInCm/30.48);
        return feet;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height in cm");

        double heightInCm = sc.nextDouble();

        heightConversion hc = new heightConversion();
        System.out.printf("Height in feet is %.2f",hc.showHeight(heightInCm));
        
    }
}
