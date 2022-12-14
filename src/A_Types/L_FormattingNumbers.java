package A_Types;

import java.text.NumberFormat;

public class L_FormattingNumbers {
    public static void main(String[] args) {

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2);

        //Chaining
        String result3 = NumberFormat.getPercentInstance().format(0.25);
        System.out.println(result3);
    }
}
