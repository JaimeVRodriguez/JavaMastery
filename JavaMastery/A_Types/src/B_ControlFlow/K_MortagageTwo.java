package B_ControlFlow;

import java.text.NumberFormat;
import java.util.Scanner;

public class K_MortagageTwo {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        float principal = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextFloat();
            if (principal >= 1_000 && principal <= 1_000_000) {
                break;
            }
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }


        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        while (annualInterestRate <= 0 || annualInterestRate > 30) {
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
        }
        float monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        while (years < 1 || years > 30) {
            System.out.println("Enter a value between 1 and 30");
            System.out.println("Period (Years): ");
            years = scanner.nextByte();
        }
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));


        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
