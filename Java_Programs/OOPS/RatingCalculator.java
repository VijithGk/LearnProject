public interface RatingCalculator 
{
    public double calculateNewRating(double playerRating, double opponentRating, double actualScore, int kFactor);

    public default double calculateExpectedScore(double playerRating, double opponentRating)
    {
        return 1/(1+Math.pow(10, (opponentRating - playerRating)/400));

    }
}
