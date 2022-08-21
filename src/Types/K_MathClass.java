package Types;

public class K_MathClass {
    public static void main(String[] args) {
        int result = Math.round(1.1F);
        System.out.println(result);

        int result2 = (int)Math.ceil(1.1F);
        System.out.println(result2);

        int result3 = Math.max(1, 2);
        System.out.println(result3);

        double result4 = Math.random() * 100;
        System.out.println(result4);


    }
}
