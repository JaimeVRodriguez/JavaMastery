package Types;

import java.text.NumberFormat;
import java.util.Scanner;

public class N_Project {
    public static void main(String[] args) {
        // ** This does have errors in the sense that if non numbers are entered
        // then the code won't work.
        // Follow on lessons will fix this.

        // mortgage = principal * (1 + r)^n / (1 + r)^n - 1
        final int MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualRate = scanner.nextDouble();
        double monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        int years = scanner.nextInt();
        int totalPayments = years * MONTHS_IN_YEAR;

        double equationTop =  monthlyRate * (Math.pow((1+ monthlyRate), totalPayments));
        double equationBottom = (Math.pow((1 + monthlyRate), totalPayments)) - 1;
        double mortgage = principal * (equationTop/equationBottom);
        String mortgageFinal = NumberFormat.getCurrencyInstance().format(mortgage);


        System.out.println("Mortgage: " + mortgageFinal);

    }
}
