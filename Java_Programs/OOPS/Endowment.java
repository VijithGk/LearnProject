package OOPS;

public abstract class Endowment 
{
    protected String endowmentID;
    protected String holderName;
    protected String endowmentType;
    protected String registrationDate;

    public Endowment()
    {
        super();
    }

    public Endowment(String endowmentID, String holderName, String endowmentType, String registrationDate) {
        super();
        this.endowmentID = endowmentID;
        this.holderName = holderName;
        this.endowmentType = endowmentType;
        this.registrationDate = registrationDate;
    }

    public String getEndowmentID() {
        return endowmentID;
    }
    public void setEndowmentID(String endowmentID) {
        this.endowmentID = endowmentID;
    }
    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public String getEndowmentType() {
        return endowmentType;
    }
    public void setEndowmentType(String endowmentType) {
        this.endowmentType = endowmentType;
    }
    public String getRegistrationDate() {
        return registrationDate;
    }
    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public abstract double calculateEndowment();

    
}
