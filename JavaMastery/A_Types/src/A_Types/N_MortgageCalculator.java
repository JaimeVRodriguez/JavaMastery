package A_Types;
import java.util.Scanner;
import java.text.NumberFormat;

public class N_MortgageCalculator {
    public static void main(String[] args) {
        // Principal
        // Annual Interest Rate
        // Period (Years)
        // Mortgage

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Principal: ");
        float principal = scanner.nextFloat();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal 
            * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments) 
            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

        
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);



    }
}
