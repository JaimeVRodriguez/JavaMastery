package B_ControlFlow;

import java.util.Scanner;

public class D_SwitchStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String role = scanner.nextLine();

        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }
        // Enhanced switch statement
        /*
        switch (role) {
            case "admin" -> System.out.println("You're an admin");
            case "moderator" -> System.out.println("You're a moderator");
            default -> System.out.println("You're a guest");
        }
        */

    }
}
