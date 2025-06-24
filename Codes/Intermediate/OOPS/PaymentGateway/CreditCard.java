package Codes.Intermediate.OOPS.PaymentGateway;

public class CreditCard implements PaymentGateway {
        public void ProcessPayment(double amount){
            System.out.println("Processing Credit Card payment of INR " +amount );
        }
    }

