package A_Types;
public class K_MathClass {
    public static void main(String[] args) {
        int result = Math.round(1.1F);
        System.out.println(result);

        int result2 = (int)Math.ceil(1.1F);
        System.out.println(result2);

        int result3 = (int)Math.floor(1.1F);
        System.out.println(result3);

        int result4 = Math.max(1, 2);
        System.out.println(result4);

        int result5 = Math.min(1, 2);
        System.out.println(result5);

        // Math.random() returns a number between 0 and 1 as a double
        double result6 = Math.random();
        System.out.println(result6);

        // Math.random() returns a number between 0 and 100 as a double
        double result7 = Math.random() * 100;
        System.out.println(result7);

        // Math.random() returns a number between 0 and 100 as an int
        int result8 = (int)Math.round(Math.random() * 100);
        System.out.println(result8);
        int result9 = (int)(Math.random() * 100);
        System.out.println(result9);
    }
}
