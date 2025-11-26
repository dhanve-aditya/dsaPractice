public class MainROughClass {

    public static void main(String[] args) {

        // sum of n natural numbers

        int n = 3;

        System.out.println(sumOfNaturalLoop(n));
        System.out.println(sumUsingRecursion(n));
    }

    public static int sumOfNaturalLoop(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static int sumUsingRecursion(int n) {
        if (n == 1)
            return n;
        return n + sumUsingRecursion(n - 1);
    }

}
