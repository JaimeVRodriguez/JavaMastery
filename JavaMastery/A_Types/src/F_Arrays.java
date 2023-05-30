import java.util.Arrays;

public class F_Arrays{
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(Arrays.toString(numbers)); 
        
        
        // Cleaner way to create an array
        int[] newNumbers = {2, 3, 5, 1, 4};
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(newNumbers));
        // Can not be placed directly into a print statement
        Arrays.sort(newNumbers);
        System.out.println(Arrays.toString(newNumbers));

        

        
    }
}