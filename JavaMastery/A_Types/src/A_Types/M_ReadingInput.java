package A_Types;
import java.util.Scanner;

public class M_ReadingInput {
    public static void main(String[] args) {
        // System.in is reading from the console/terminal
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Age: ");
        byte age = scanner.nextByte(); // Read a byte
        System.out.println("You are " + age);

        System.out.print("Name: ");
        String name = scanner.nextLine().trim(); // Read a string and trim the whitespace
        System.out.println("You are " + name);

    }
}