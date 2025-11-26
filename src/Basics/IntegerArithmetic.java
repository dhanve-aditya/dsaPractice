package Basics;

public class IntegerArithmetic {

    public static void main(String[] args) {
        // sum of digits of number
        System.out.println(inputSum(1234));

        // sum of digits of number using recursion
        System.out.println(recursionSum(1234));

    }

    /**
     * Sum formula > pop the last digit using the %10 operator and denominator and use /10 till input!=0
     * @param inputSum
     * @return
     */
    public static int inputSum(int inputSum) {
        int result = 0;
        while (inputSum != 0) {
            result += (inputSum % 10);
            inputSum = inputSum / 10;
        }
        return result;
    }

    /**
     * recursive call until base criteria of input==0 is not met. Same logic as arithmetic, %10 & /10
     * @param input
     * @return
     */
    public static int recursionSum(int input) {
        if (input == 0)
            return 0;
        return (input % 10) + recursionSum(input / 10);

    }
}
