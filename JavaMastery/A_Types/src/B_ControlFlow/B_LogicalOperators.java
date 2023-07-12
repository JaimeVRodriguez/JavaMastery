package B_ControlFlow;

import java.text.MessageFormat;

public class B_LogicalOperators {
    
    public static void main(String[] args) {
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(MessageFormat.format("Is warm: {0}", isWarm));

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(MessageFormat.format("Is eligible: {0}", isEligible));
    }


}
