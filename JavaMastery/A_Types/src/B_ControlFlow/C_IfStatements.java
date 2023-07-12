package B_ControlFlow;

public class C_IfStatements {

    public static void main(String[] args) {
        
        int temp = 22;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        } 
        else if (temp > 20 && temp <= 30) {
            System.out.println("Beautiful day");
        } 
        else {
            System.out.println("Cold day");
        }


        // Simplify an if statement
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);


        // Ternary operator
        int income2 = 120_000;
        // This statement assigns className to "First" if true, and "Economy" if false
        String className = income2 > 100_000 ? "First" : "Economy";
        System.out.println(className);


    }
    
}
