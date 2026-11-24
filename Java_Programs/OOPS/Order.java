package OOPS;

public class Order 
{
    private String customerName;
    private int orderNumber;
    private String deliveryType;
    private String foodName;
    private long phoneNumber;

    public String getCustomerName()
    {
        return customerName;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public int getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    public String getDeliveryType() {
        return deliveryType;
    }
    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }
    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Order(String customerName, int orderNumber, String deliveryType, String foodName, long phoneNumber)
    {
        this.customerName = customerName;
        this.orderNumber = orderNumber;
        this.deliveryType = deliveryType;
        this.foodName = foodName;
        this.phoneNumber = phoneNumber;
        
    }


    public double calculateTotalBill(double cost)
        {
            double tax;
            if ("Home Delivery".equalsIgnoreCase(deliveryType)) 
            {
                tax = 0.8;    
            }
            else if("Parcel".equalsIgnoreCase(deliveryType))
            {
                tax = 0.5;
            }
            else if("Normal Order".equalsIgnoreCase(deliveryType))
            {
                tax = 0.3;
            }
            else{
                return -1;
            }
            return (cost*tax)+cost;
        }
    
    

    
}
