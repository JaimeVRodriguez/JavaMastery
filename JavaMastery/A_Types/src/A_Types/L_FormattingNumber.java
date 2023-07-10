package A_Types;
import java.text.NumberFormat;

public class L_FormattingNumber {
    public static void main(String[] args) {
        NumberFormat currency =  NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        // Chained method
        String percent = NumberFormat.getPercentInstance().format(0.2);
        System.out.println(percent);
    }
}
