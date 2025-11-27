package Practice.Basics;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 10;

        int b = 20;

        swapUsingTempValue(a, b);

        swapUsingArithmetic(a, b);

        swapUsingMultiplyDivide(a, b);

        swapUsingSingleStatement(a, b);
    }

    public static void print(int a, int b) {
        System.out.println("a>" + a);
        System.out.println("b>" + b);
    }

    /**
     * uses third temp varaible
     *
     * @param a
     * @param b
     */
    public static void swapUsingTempValue(int a, int b) {
        int temp = b;
        b = a;
        a = temp;
        print(a, b);
    }

    /**
     * using addition arithmetic operator
     * doesn't use temp third variable
     *
     * @param a
     * @param b
     */
    public static void swapUsingArithmetic(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        print(a, b);
    }

    /**
     * using multiply and divide operators
     * doesn't have any third value
     *
     * @param a
     * @param b
     */
    public static void swapUsingMultiplyDivide(int a, int b) {
        a = a * b;
        b = a / b;
        a = a / b;
        print(a, b);
    }

    public static void swapUsingSingleStatement(int a, int b) {
        b = a + b - (a = b);
        print(a, b);
    }
}
