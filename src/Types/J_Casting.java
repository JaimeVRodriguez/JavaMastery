package Types;

public class J_Casting {
    public static void main(String[] args) {
        // Implicit casting
        // byte > short > int > long > float > double
        // casting makes it so that it converts variables to the same type when needed
        short x =1;
        int y = x + 2;

        double x2 = 1.1;
        double y2 = x2 + 2;

        // Explicit casting, making the type what you want
        double x3 = 1.1;
        int y3 = (int)x3 + 2; // will remove what is after the decimal on x3

        String x4 = "1";
        int y4 = Integer.parseInt(x4) + 2;

        System.out.println(y);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(y4);
    }
}
