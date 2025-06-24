package Codes.Intermediate.OOPS.PaymentGateway;

public class PayPal implements PaymentGateway{
    public void ProcessPayment(double amount){
        System.out.println("Processing PayPal payment of INR " +amount );
    }
}
