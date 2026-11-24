package OOPS;

import java.util.Scanner;

import ArrsStrings.somOfMax;

public class PaymentUI 
{
    public static void main(String[] args) 
    {
        Payment payment;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name: ");
        String name = sc.next();
        System.out.println("Enter Mobile Nuber: ");
        long mobileNumber = sc.nextLong();
        System.out.println("Enter bill amount");
        double billAmount = sc.nextDouble();

        System.out.println("Enter Payment Method: \n1.Cash \n2.Credit Card \n3.UPI");
        int choice = sc.nextInt();
        sc.nextLine();
        if(choice==1)
        {
            payment = new Payment(name, mobileNumber, billAmount);
            System.out.println("Customer name: "+name+" \nMobile Number: "+mobileNumber+" \nBill Amount: "+payment.calculateFinalBill());
        }

        if(choice==2)
        {
            payment = new CardPayment(name, mobileNumber, billAmount);
            System.out.println("Customer name: "+name+" \nMobile Number: "+mobileNumber+" \nBill Amount: "+payment.calculateFinalBill());
        }

        if(choice==3)
        {
            payment = new UpiPayment(name, mobileNumber, billAmount);
            System.out.println("Customer name: "+name+" \nMobile Number: "+mobileNumber+" \nBill Amount: "+payment.calculateFinalBill());
        }
        else if(choice>3){
            System.out.println("Invalid Choice");
            sc.close();
        }

    }
}
