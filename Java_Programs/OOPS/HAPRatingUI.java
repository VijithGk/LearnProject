import java.util.Scanner;

public class HAPRatingUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter Player ID: ");
        String playerID = sc.next();
        
        System.out.println("Enter Player Name: ");
        String playerName = sc.next();
        sc.next();
        System.out.println("Enter Player old rating: ");
        double oldRating = sc.nextDouble();

        System.out.println("Enter opponent Rating: ");
        double opponentRating = sc.nextDouble();

        System.out.println("Enter actual score (1 for win, 0.5 for draw, 0 for loss):");
        double actualScore = sc.nextDouble();

        System.out.println("Enter K factor (32 for new players, 16 for established players):");
        int kFactor = sc.nextInt();

        PlayerInfo pInfo = new PlayerInfo(playerID, playerName, oldRating, opponentRating, actualScore, kFactor);
        System.out.println("Player New Rating is: "+pInfo.calculateNewRating(oldRating, opponentRating, actualScore, kFactor));

    }
}
