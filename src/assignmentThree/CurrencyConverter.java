package assignmentThree;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class CurrencyConverter {
    private static double USD_TO_INR = 82.5;
    private static double EUR_TO_INR = 90.0;


    public static double  convertUSDToINR( double amountUSD) {
        return amountUSD * USD_TO_INR;
    }
    public static double convertEURTOINR(double amountEUR){
        return amountEUR * EUR_TO_INR;
    }

}
class TestCurrencyConverter {
    public static void main(String[] args) {
        // for printing unique code
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        double amount = 150;
        double totalAmount = CurrencyConverter.convertUSDToINR(amount);
        System.out.println("$"+ amount +" in INR:\u20B9" + totalAmount );

        double totalAmount1 = CurrencyConverter.convertEURTOINR(amount);
        System.out.println("\u20AC"+ amount +" in INR:\u20B9" + totalAmount1 );
    }
}
