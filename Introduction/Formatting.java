package Introduction;
import java.text.NumberFormat;
import java.util.Locale;

public class Formatting {
    public static void main(String[] args){
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("New Salary is: " + currencyInstance.format( 10000000));

        NumberFormat percentage = NumberFormat.getPercentInstance(Locale.US);
        System.out.println("New increment is: " + percentage.format(.65748));
    }
}
