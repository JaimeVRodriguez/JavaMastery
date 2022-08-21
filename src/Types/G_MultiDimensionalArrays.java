package Types;

import java.util.Arrays;

public class G_MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3]; // two rows and three columns
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        int[][] moreNumbers = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(moreNumbers));
    }
}
