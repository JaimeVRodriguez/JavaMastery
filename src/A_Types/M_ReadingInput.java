package A_Types;

import java.util.Scanner;

public class M_ReadingInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: "); // use print when you want on the same line
        byte age = scanner.nextByte();
        System.out.println("You are " + age);

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner1.nextLine();
        System.out.println("You are " + name.trim());

    }
}
