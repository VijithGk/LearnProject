package Collections;

public class PlayerModel 
{
    private String playerID;
    private String playerName;
    private int level;
    private double score;

    public PlayerModel(String playerID, String playerName, int level, double score) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.level = level;
        this.score = score;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "PlayerModel [playerID=" + playerID + ", playerName=" + playerName + ", level=" + level + ", score="
                + score + "]";
    }

    
    
}
