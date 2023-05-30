public class J_Casting {
    public static void main(String[] args) {
        // Implicit casting (automatically done by compiler)
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        double a = 1.1;
        double b = a + 2;
        System.out.println(b);

        // Explicit casting (manually done by programmer)
        double c = 1.1;
        int d = (int)c + 2;
        System.out.println(d);

        // String to int
        String e = "1";
        int f = Integer.parseInt(e) + 2;
        System.out.println(f);
    }
}
