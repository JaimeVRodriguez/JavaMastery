package C_Source;

public class A_Methods {
    public static void main(String[] args) {
        String messageJaime = greetUser("Jaime", "Rodriguez");
        System.out.println(messageJaime);
    }

    public static String greetUser(String firstName, String lastName) {
        //System.out.println("Hello " + firstName + " " + lastName);
        return "Hello " + firstName + " " + lastName;
    }
}
