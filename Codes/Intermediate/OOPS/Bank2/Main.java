package Codes.Intermediate.OOPS.Bank2;

public class Main {
    public static void main(String[] args) {
        Bank ob;
        ob = new SBI();
        ob.GetRateOfInterest();
        ob = new HDFC();
        ob.GetRateOfInterest();
        ob = new ICICI();
        ob.GetRateOfInterest();
    }
}
