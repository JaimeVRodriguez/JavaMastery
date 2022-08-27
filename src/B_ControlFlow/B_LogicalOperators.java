package B_ControlFlow;

public class B_LogicalOperators {
    public static void main(String[] args) {
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; // && is "and", both of these expressions must be true for it to be all true
        System.out.println(isWarm);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; // || is "or"
        System.out.println(isEligible);
    }

}
