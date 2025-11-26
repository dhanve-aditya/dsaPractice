package RecursionPractice;

public class NaturalNumbersSum {


    public static void main(String[] args) {
        System.out.println(sumUsingRecursion(5));
        System.out.println(sumOfNumbers(10));
    }


    //with recursion enhanced
    public static int sumUsingRecursion(int n) {
        if (n == 1)
            return n;
        return n + sumUsingRecursion(n - 1);
    }


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
