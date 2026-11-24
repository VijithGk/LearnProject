package OOPS;

public class CardPayment extends Payment
{
    public CardPayment(String customerName, long mobileNumber, double billAmount)
    {
        super(customerName, mobileNumber, billAmount);
    }
    
    @Override
    public double calculateFinalBill()
    {
        double bill = getBillAmount();
        return bill+(bill*0.015)+(bill*0.18);
    }  
}
