package B_ControlFlow;

public class C_IfStatements {
    public static void main(String[] args) {
        int temp = 32;

        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        }
        else if (temp > 20) {
            System.out.println("Beautiful day");
        }
        else {
            System.out.println("Cold day");
        }


        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);

        System.out.println(hasHighIncome);
    }
}
