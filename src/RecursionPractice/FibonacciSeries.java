package RecursionPractice;

public class FibonacciSeries {

    public static void main(String[] args) {
       System.out.println(fibonacciSeries(5));
    }


    // print fibonacci series till nth number
    public static int fibonacciSeries(int n) {
        if (n == 1)
            return n;
        return n * fibonacciSeries(n - 1);
    }
}
