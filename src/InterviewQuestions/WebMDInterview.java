package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WebMDInterview {

    public static void main(String[] args) {
        int inputInt = 22221;
        // sum of digits of an integer using recursion
//        System.out.println(recursionSum(inputInt));

        // sum of digits of an integer using arithmetic operations
//        System.out.println(sumOfInt(inputInt));

        // reverse an integer using arithmetic operations
//        System.out.println(reverseIntType(inputInt));

        //concatenate two arrays
//        concatIntArr();

        //process Array String and Arraylist
        processStringArray();

        //process Integer Array and Arraylist
        // String, Array & ArrayList
        processingArray();
    }

    /**
     * sum of digits of an integer using recursion
     *
     * @param input
     * @return
     */
    public static int recursionSum(int input) {
        if (input == 0)
            return 0;
        return (input % 10) + recursionSum(input / 10);

    }

    /**
     * first question, given an integer i =3456, give me the sum of the number
     *
     * @param inputInt
     * @return
     */
    public static int sumOfInt(int inputInt) {
        int result = 0;
        while (inputInt != 0) {
            result += (inputInt % 10);
            inputInt = (inputInt / 10);
        }
        return result;
    }

    /**
     * second question, reverse the number. Don't change the data type
     *
     * @param inputInt
     * @return
     */
    public static int reverseIntType(int inputInt) {
        int result = 0;

        while (inputInt != 0) {
            result = result * 10 + (inputInt % 10);
            inputInt = inputInt / 10;
        }
        return result;
    }

    //third question, given two integer arrays, concatenate them

    /**
     * concatenate two arrays, sort the array using bubble sort and reverse using two pointer technique
     */
    public static void concatIntArr() {
        int[] a = {1, 2, 3, 4};
        int[] b = {8, 9, 6};

        int[] result = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[i + a.length] = b[i];
        }

        System.out.println(Arrays.toString(result));

        //sorted array using bubble sort
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - i - 1; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j + 1];
                    result[j + 1] = result[j];
                    result[j] = temp;
                }

            }
        }

        System.out.println("Sorted Array" + Arrays.toString(result));

        //reverse the same array using two pointer technique
        int leftPointer = 0;
        int rightPointer = result.length - 1;

        while (leftPointer < rightPointer) {
            int temp = result[rightPointer];
            result[rightPointer] = result[leftPointer];
            result[leftPointer] = temp;
            leftPointer++;
            rightPointer--;
        }

        System.out.println("Reversed Array" + Arrays.toString(result));

    }

    /**
     * Given an array of strings, convert to list and vice versa, also sort it and reverse it
     */
    public static void processStringArray() {
        String[] arr = {"a", "d", "i", "t", "y", "a"};

        List<String> listArr = Arrays.asList(arr);
        listArr.add("z");
        String[] updatedArr = listArr.toArray(new String[0]);

        for (int i = 0; i < updatedArr.length - 1; i++) {
            for (int j = 0; j < updatedArr.length - i - 1; j++) {
                if (updatedArr[j].compareTo(updatedArr[j + 1]) > 0) {
                    String temp = updatedArr[j + 1];
                    updatedArr[j + 1] = updatedArr[j];
                    updatedArr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(updatedArr));

    }

    public static void processingArray() {

//        arryToString(arr);
//
//        List<String> ls = arrayToArraylist(arr);
//        List<String> e1 = Arrays.asList(arr);

////        System.out.println(e1);
////
////
////        //new String[0] > JVM creates array of correct size automatically
//        String[] lsTOAr = ls.toArray(new String[0]);

        //listToArray doesn't work for primitive data types, because generics cannot  use primitives

        //

//        listToArray(ls)

    }

    public static List<String> arrayToArraylist(String[] ip) {
        List<String> ls = new LinkedList<>();

        for (String s : ip) {
            ls.add(s);
        }


        return ls;
    }

    public static void arryToString(String[] arr) {
        // Arrays.toString prints actual array, it's like a snapshot because it contains square brackets and , as well
        System.out.println(Arrays.toString(arr));

        // these methods just print the string representation of the object
        // String.value of works only for char array, new String(arr) for char only
        System.out.println(String.valueOf(arr));
        System.out.println(arr.toString());

        //using looping and stringbuilder
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s).append(",");
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }
}
