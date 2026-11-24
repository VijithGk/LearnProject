public interface FitnessMonitor 
{
    public String calculateFitnessLevel();

    public static double calculateCaloriesBurnt(double weight, double distanceCovered, boolean runningStatus)
    {
        //UserFitnessData uData = new UserFitnessData(null, weight, 0, distanceCovered, runningStatus);

        if(runningStatus)
        {
            return 0.75*weight*distanceCovered;
        }
        else{
            return 0.53*weight*distanceCovered;
        }
    }
}
