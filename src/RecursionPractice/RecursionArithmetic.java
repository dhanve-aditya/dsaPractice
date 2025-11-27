package RecursionPractice;

import java.util.Arrays;

public class RecursionArithmetic {

    public static void main(String[] args) {
        // GIven and integer, perform the factorial operation using recursion 5fact = 5x4x3x2x1
        System.out.println(factorialRecursion(7));

        //Sum of n natural numbers using recursion
        System.out.println(sumUsingRecursion(5));

        // fibonacci series 0,1,1,2,3,5,8,13,21
        System.out.println(Arrays.toString(fibonacciSeries(9)));

        // fibonacci series 0,1,1,2,3,5,8,13,21 using recursion
        System.out.println(fibonacciRecursion(9));


    }

    /**
     * Factorial of a number using recursion, 5(factorial) = 5*4*3*2*1
     *
     * @param n
     * @return
     */
    public static int factorialRecursion(int n) {
        if (n == 1)
            return 1;
        return n * factorialRecursion(n - 1);
    }

    /**
     * Sum of n natural numbers using recursion
     *
     * @param n
     * @return
     */
    public static int sumUsingRecursion(int n) {
        if (n == 1)
            return n;
        return n + sumUsingRecursion(n - 1);
    }

    /**
     * Fibonacci series using array and arithmetic + assignment operators
     * @param n
     * @return
     */
    public static int[] fibonacciSeries(int n) {
        int[] result = new int[n];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < result.length; i++) {
            int first = result[i - 2];
            int second = result[i - 1];
            result[i] = first + second;
        }
        return result;
    }

    /**
     * Fibonacci series using recursion
     * @param n
     */
    public static String fibonacciRecursion(int n) {
        // print and generate recursion
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + (recursionFormula(i) + " ");
        }
        return result;
    }

    public static int recursionFormula(int n) {
        // Base cases:
        // If n is 0, the Fibonacci number is 0.
        // If n is 1, the Fibonacci number is 1.
        if (n <= 1) {
            return n;
        }
        // Recursive case:
        // The nth Fibonacci number is the sum of the (n-1)th and (n-2)th Fibonacci numbers.
        return recursionFormula(n - 1) + recursionFormula(n - 2);
    }


}
