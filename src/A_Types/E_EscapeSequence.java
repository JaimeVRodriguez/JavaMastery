package A_Types;

public class E_EscapeSequence {
    public static void main(String[] args) {
        String message = "Hello \"Jaime\""; // the \ allows for the use of quotes
        String messageTwo = "This will have \na new line"; // another escape sequence

        System.out.println(message);
        System.out.println(messageTwo);
    }
}
