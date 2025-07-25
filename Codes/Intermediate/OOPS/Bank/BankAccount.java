package Codes.Intermediate.OOPS.Bank;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount (String accountNumber , String accountHolderName ) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

    }

    public void  depositMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid Deposit.");
        } else {
            balance = balance + money;
        }
    }

    public double withdrawMoney(double money){
        if (money <= 0){
            System.out.println("Invalid Withdrawal");
        }else if(balance >= money){
            balance = balance - money;
        }else{
            money = balance;
            balance = 0;
        }
        return money;
    }
}
