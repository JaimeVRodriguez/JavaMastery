package A_Types;

import java.util.Arrays;

public class F_Arrays {
    public static void main(String[] args) {
        // array is a list of something

        int [] numbers = new int[5]; // inside bracket is the number of items in the array
        numbers[0] = 1; // the number 1 is at index 0
        numbers[1] = 2; // any index not initialized will default to 0
        String printedNumbers = Arrays.toString(numbers);
        System.out.println(printedNumbers);

        // more efficient way to create an array
        int[] numbersTwo = {2, 3, 5, 1, 4};
        Arrays.sort(numbersTwo);
        String printedNumbersTwo = Arrays.toString(numbersTwo);
        System.out.println(numbersTwo.length);
        System.out.println(printedNumbersTwo);


    }
}
