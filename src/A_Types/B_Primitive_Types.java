package A_Types;

public class B_Primitive_Types {

    public static void main(String[] args) {
        // primitive for storing simple types
        // byte, Bytes-1, Range-[-128,127]
        // short, 2, [-32k, 32k]
        // int, 4, [-2B, 2B]
        // long, 8
        // float(decimal), 4
        // double(decimal, 8
        // char, 2, [A,B,C...]
        // boolean, 1, [true/false]

        byte age = 30;
        int viewsCount = 123_456_789; //underscore to make numbers more readable, like a comma
        long moreViews = 3_123_446_789L; //use L for long numbers as compiler reads it as an int
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;
    }

}
