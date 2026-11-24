package OOPS;

public class DiscountBero {
    //@SuppressWarnings("null")
    public double calculateDiscount(Bero obj)
    {
        double discountAmount = 0;
        //Bero b = null;
        if(obj.getBeroType().equalsIgnoreCase("Steel Bero"))
        {
            discountAmount = (obj.getPrice()*10)/100;
        }

        else if(obj.getBeroType().equalsIgnoreCase("Wooden Bero"))
        {
            discountAmount = (obj.getPrice()*15)/100;
        }

        return discountAmount;
    }
}
