package PracticeImpDSA;

public class Recursion {

    public static void main(String[] args) {

        System.out.println(factorialRecursion(7));

    }


    public static int factorialRecursion(int n) {
        if (n == 1)
            return 1;
        return n * factorialRecursion(n - 1);
    }
}
