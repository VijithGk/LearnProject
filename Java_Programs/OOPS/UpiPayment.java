package OOPS;

public class UpiPayment extends Payment
{
    public UpiPayment(String customerName, long mobileNumber, double billAmount)
    {
        super(customerName, mobileNumber, billAmount);
    }
    
    @Override
    public double calculateFinalBill()
    {
        double bill = getBillAmount();
        return bill-(bill*0.02);
    }  
}
