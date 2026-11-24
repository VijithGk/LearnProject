package OOPS;

public class Payment 
{
    protected String customerName;
    protected long mobileNumber;
    protected double billAmount;
    
    public Payment(String customerName, long mobileNumber, double billAmount) {
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public double calculateFinalBill()
    {
        double bill = getBillAmount();
        return bill+(bill*0.01);
    }   
}
