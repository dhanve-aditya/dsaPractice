package Practice.Basics;

public class IntegerArithmetic {

    public static void main(String[] args) {
        // sum of digits of number
        System.out.println(inputSum(1234));

        // sum of digits of number using recursion
        System.out.println(recursionSum(1234));

        // sum of n natural numbers


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

    /**
     * start with n aand then decrement the value till you reach 0 (iterate to perform operations till thne)
     * @param a
     * @return
     */
    public static int sumOfNumbers(int a) {
        int sum = 0;
        int currentValue = a;
        while (currentValue > 0) {
            sum += currentValue;
            currentValue--;
        }
        return sum;
    }

    public static int sumOfNaturalLoop(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
