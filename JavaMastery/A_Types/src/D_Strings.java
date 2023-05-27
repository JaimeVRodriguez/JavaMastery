public class D_Strings {
    public static void main(String[] args) {
        String message = new String("Hello World");
        // Both are acceptable
        // This way is more efficient
        String alternate = "Hello World";
        String concat = "Hello" + "!!";

        System.out.println(concat);
        System.out.println(message.endsWith("!!"));
        System.out.println(alternate.length());
        System.out.println(concat.indexOf("e"));
        System.out.println(concat.replace("H", "B"));

        // All of these are methods of the String class
    }
}
