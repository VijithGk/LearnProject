package Collections;

public class PlayerUtil 
{
    public static PlayerModel parsePlayer(String input)
    {
        String[] userInput = input.split(":");
        String playerID = userInput[0];
        String playerName = userInput[1];
        int level = Integer.parseInt(userInput[2]);
        double score = Double.parseDouble(userInput[3]);

        if(validate(playerID))
        {
            return new PlayerModel(playerID, playerName, level, score);
        }
        return null;

    }

    public static boolean validate(String playerID)
    {
        String pattern = "^PLY\\d{2}-[A-Z]{3}";
        if(playerID.matches(pattern))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
