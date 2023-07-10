package A_Types;
public class E_EscapseSequence {
    public static void main(String[] args) {
        // Need to "escape" the quotes in order to use the quotes inside a string
        String message = "Hello \"Jaime\"";
        System.out.println(message);

        // \n will start a new line at that point
        String newLine = "Hello \nKrystal";
        System.out.println(newLine);
    }
}
