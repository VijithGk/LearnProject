public class PlayerInfo implements RatingCalculator
{
    private String playerID;
    private String playerName;
    private double playerRating;
    private double opponentRating;
    private double actualScore;
    private int kFactor;

    
    public PlayerInfo(String playerID, String playerName, double playerRating, double opponentRating,
            double actualScore, int kFactor) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.playerRating = playerRating;
        this.opponentRating = opponentRating;
        this.actualScore = actualScore;
        this.kFactor = kFactor;
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


    public double getPlayerRating() {
        return playerRating;
    }


    public void setPlayerRating(double playerRating) {
        this.playerRating = playerRating;
    }


    public double getOpponentRating() {
        return opponentRating;
    }


    public void setOpponentRating(double opponentRating) {
        this.opponentRating = opponentRating;
    }


    public double getActualScore() {
        return actualScore;
    }


    public void setActualScore(double actualScore) {
        this.actualScore = actualScore;
    }


    public int getkFactor() {
        return kFactor;
    }


    public void setkFactor(int kFactor) {
        this.kFactor = kFactor;
    }

    @Override
    public double calculateNewRating(double playerRating, double opponentRating, double actualScore, int kFactor)
    {
        return getPlayerRating() + getkFactor() * (getActualScore() - calculateExpectedScore(playerRating, opponentRating));
    }


    
}
