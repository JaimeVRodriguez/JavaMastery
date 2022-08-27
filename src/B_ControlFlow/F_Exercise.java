package B_ControlFlow;

import java.util.Scanner;

public class F_Exercise {
    public static void main(String[] args) {
        // if number is dividisble by 5 get fizz
        // if number is divisible by 3 get buzz
        // if number id divisible by both get fizz buzz
        // not divisible get number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int userNumber = scanner.nextInt();

        if (userNumber % 15 == 0)
            System.out.println("FizzBuzz");
        else if (userNumber % 5 == 0)
            System.out.println("Fizz");
        else if (userNumber % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(userNumber);

    }
}
