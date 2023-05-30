import java.util.Arrays;

public class G_MultiDimArrays {
    public static void main(String[] args) {
        // 2D array with 2 rows and 3 columns
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;

        System.out.println(Arrays.deepToString(numbers));

        // Cleaner way to create a 2D array
        int[][] newNumbers = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(Arrays.deepToString(newNumbers));
    }
}
