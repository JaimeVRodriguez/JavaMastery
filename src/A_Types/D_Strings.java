package A_Types;

public class D_Strings {

    public static void main(String[] args) {
        // proper way
        String message = new String("Hello!");
        // also the following
        String messageTwo = "Hello World";

        System.out.println(message);

        // String is a reference type, has methods
        System.out.println(message.endsWith("!"));
        System.out.println(message.indexOf("H"));
        System.out.println(message.replace("!", "?")); // this does not modify the original string
        System.out.println(messageTwo.toLowerCase());


    }
}
