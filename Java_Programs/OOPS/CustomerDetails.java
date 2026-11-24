package OOPS;

import ArrsStrings.resortBooking;

public class CustomerDetails implements BonusPoints, DoorDelivery
{
    private String customerName;
    private String phoneNumber;
    private String streetName;
    private double billAmount;
    private int distance;
    
    public CustomerDetails(String customerName, String phoneNumber, String streetName, double billAmount,
            int distance) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.streetName = streetName;
        this.billAmount = billAmount;
        this.distance = distance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double calculateBonusPoints()
    {
        //int bonusPoints = 0;
        if(getBillAmount()>=250)
        {
            return getBillAmount()/10;
        }
        else
            return 0;
    }

    public double deliveryCharge()
    {
        if(getDistance()>=25)
        {
            return getDistance()*8;
        }
        else if(getDistance() >=15 && getDistance()<25)
        {
            return getDistance()*5;
        }
        else if(getDistance() <15 && getDistance()>0)
        {
            return getDistance()*2;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "CustomerDetails [customerName=" + customerName + ", phoneNumber=" + phoneNumber + ", streetName="
                + streetName + ", billAmount=" + billAmount + ", distance=" + distance + " ,Bonus Points: "+calculateBonusPoints()+",Delivery Charge: " + deliveryCharge();
    }

    
}
