package Basics;

public class ReverseString {

    public static void main(String[] args) {
        String s = "Gabru";

        System.out.println(basicReverse(s));
        System.out.println(reverseStringRecursion(s));
        System.out.println(reverseStringCharArr(s));
        System.out.println(reverseStringBuilder(s));
    }

    /**
     * use string length and read backwards, decrementing the counter, and use blank string to keep concatenating
     * @param inputString
     * @return
     */
    public static String basicReverse(String inputString) {
        char[] inputArr = inputString.toCharArray();
        String result = "";
        for (int i = inputArr.length - 1; i >= 0; i--) {
            result += inputArr[i];
        }
        return result;
    }


    /**
     * Use recursion to get last char and append using substring
     *
     * @param s
     * @return
     */
    public static String reverseStringRecursion(String s) {
        if (s.isEmpty())
            return s;
        return s.charAt(s.length() - 1) + reverseStringRecursion(s.substring(0, s.length() - 1));
    }

    /**
     * two pointer technique
     * @param s
     * @return
     */
    public static String reverseStringCharArr(String s) {
        char[] c = s.toCharArray();

        int startPointer = 0;
        int endpointer = s.length() - 1;

        while (startPointer < endpointer) {
            char temp = c[endpointer];
            c[endpointer] = c[startPointer];
            c[startPointer] = temp;
            startPointer++;
            endpointer--;
        }

        return String.valueOf(c);
    }

    /**
     * using StringBuilder functions
     * @param inputString
     * @return
     */
    public static String reverseStringBuilder(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }
}
