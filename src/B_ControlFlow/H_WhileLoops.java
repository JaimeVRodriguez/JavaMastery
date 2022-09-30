package B_ControlFlow;

import java.util.Scanner;

public class H_WhileLoops {

    public static void main(String[] args) {
        //for (int i = 0; i < 5; i++) {
            //System.out.println("Hello World " + i);
        //}

        int i = 0;
        while (i < 5) {
            System.out.println("Hello World " + i);
            i++;
        }
        System.out.println("____");
        //Real Application below

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}
