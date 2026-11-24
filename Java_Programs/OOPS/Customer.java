package OOPS;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

public class Customer extends User implements Purchasable, Readable
{
    private double totalPrice;
    private double discountPercentage;
    private List<Integer> ratings;
    
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public double getDiscountPercentage() {
        return discountPercentage;
    }
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public List<Integer> getRatings() {
        return ratings;
    }
    public void setRatings(List<Integer> ratings) {
        this.ratings = ratings;
    }
    public Customer(String userName) {
        super(userName);
        this.totalPrice = 0;
        this.discountPercentage = 0;
        this.ratings = new ArrayList<>();
    }

    //methods
    public void applyDiscount(double discountPercentage)
    {
        this.discountPercentage = discountPercentage;
    }

    public double calculateTotalPrice()
    {
        return getTotalPrice()-(getTotalPrice() * getDiscountPercentage()/100);
        //totalPrice - (totalPrice * discountPercentage / 100);
    }

    public void leaveReview(int rating)
    {
        ratings.add(rating);
    }

    public double calculateAverageRating()
    {
        double avg = 0.0;
        if(ratings.isEmpty())
            return 0;

        else{
            for(Integer a : ratings)
            {
                avg += a;
            }

            return avg/ratings.size();
        }
    }
    @Override
    public int read(CharBuffer cb) throws IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }


}
