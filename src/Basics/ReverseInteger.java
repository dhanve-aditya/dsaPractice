package Basics;

public class ReverseInteger {

    public static void main(String[] args) {
        int inputInt = 378921;

//        System.out.println(arithmeticReverse(inputInt));
//        System.out.println(recursionReverse(0, inputInt));
        System.out.println(reverseWithString(inputInt));
    }

    /**
     * reverse by the formula as: i * 10 + (ip%10)
     *
     * @param inputInt
     * @return
     */
    public static int arithmeticReverse(int inputInt) {
        int reverseResult = 0;
        while (inputInt != 0) {
            reverseResult = reverseResult * 10 + (inputInt % 10);
            inputInt = inputInt / 10;
        }
        return reverseResult;
    }

    /**
     * parse using recursion function
     *
     * @param result
     * @param inputInt
     * @return
     */
    public static int recursionReverse(int result, int inputInt) {
        if (inputInt == 0)
            return result;
        result = result * 10 + (inputInt % 10);
        return recursionReverse(result, inputInt / 10);
    }

    /**
     * Parse int ot string then convert to char array and use two pointer technique to reverse
     * @param input
     * @return
     */
    public static int reverseWithString(int input) {
        char[] inputChar = String.valueOf(input).toCharArray();

        int leftpointer = 0;
        int rightPointer = inputChar.length - 1;

        while (leftpointer < rightPointer) {
            char temp = inputChar[rightPointer];
            inputChar[rightPointer] = inputChar[leftpointer];
            inputChar[leftpointer] = temp;
            leftpointer++;
            rightPointer--;
        }

        return Integer.parseInt(String.valueOf(inputChar));


    }


}
