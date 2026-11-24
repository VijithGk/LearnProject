package OOPS;

public class HealthEndowment extends Endowment
{
    private String healthCareCenter;
    private int holderAge;

    public HealthEndowment() 
    {
        super();
    }


    public HealthEndowment(String endowmentID, String holderName, String endowmentType, String registrationDate, String healthCareCenter, int holderAge) {
        super(endowmentID, holderName, endowmentType, registrationDate);
        this.healthCareCenter = healthCareCenter;
        this.holderAge = holderAge;
    }


    public String getHealthCareCenter() {
        return healthCareCenter;
    }
    public void setHealthCareCenter(String healthCareCenter) {
        this.healthCareCenter = healthCareCenter;
    }
    public int getHolderAge() {
        return holderAge;
    }
    public void setHolderAge(int holderAge) {
        this.holderAge = holderAge;
    }

    public double calculateEndowment()
    {
        double endowmentAmount=0;
        if(holderAge<=30)
        {
            endowmentAmount = 120000;
        }
        else if(holderAge>30 && holderAge<60)
        {
            endowmentAmount = 200000;
        }
        else if(holderAge<=60)
        {
            endowmentAmount = 500000;
        }

        return endowmentAmount;
    }
}
