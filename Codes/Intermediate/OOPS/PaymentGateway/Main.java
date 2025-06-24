package Codes.Intermediate.OOPS.PaymentGateway;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentGateway gateway;

        System.out.println("Choose payment method.");
        System.out.println("1. PayPal");
        System.out.println("2. Credit Card");
        int choice = sc.nextInt();

        System.out.print("Enter amount to pay: ");
        double amount = sc.nextDouble();

        if (choice == 1){
            gateway = new PayPal();
        }
        else if ( choice == 2){
            gateway = new CreditCard();
        }
        else{
            System.out.println("Invalid choice.");
            return;
        }
        gateway.ProcessPayment(amount);
    }
}
