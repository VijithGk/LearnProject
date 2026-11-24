package OOPS;

import ArrsStrings.somOfMax;

public class CustomerUI 
{
    public static void main(String[] args) 
    {
        Customer customer = new Customer("Vijith");
        customer.login();

        //add items to shopping cart
        double item1 = 200;
        double item2 = 600;
        double item3 = 350;

        double totalPrice = item1+item2+item3;

        //setting total price
        customer.setTotalPrice(totalPrice);
        System.out.println("Total price before discount: "+customer.getTotalPrice());
        //applying discount;
        customer.applyDiscount(10);

        //final payable amount
        System.out.println("Final Payable Amount is: "+customer.calculateTotalPrice());

        //leave review
        customer.leaveReview(8);
        customer.leaveReview(7);
        customer.leaveReview(6);
        customer.leaveReview(10);

        System.out.println("The Average Review is: "+customer.calculateAverageRating());

        customer.logout();
    }
}
