package B_ControlFlow;

public class E_SwitchStatements {
    public static void main(String[] args) {
        String role = "moderator";

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
    }
}
