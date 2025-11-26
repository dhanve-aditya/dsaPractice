package PracticeImpDSA;

import java.util.Arrays;
import java.util.TreeMap;

public class Sorting {

    //Sorting strings using bubble sort
    //Bitonic sorting

    public static void main(String[] args) {
        String stringInput = "dbcazxy";
//        int z = 69182;
//        String stringInput = String.valueOf(z);
        //whenever you are asked sorting question, create an array of it either in char or int
        char[] charArrOfString = stringInput.toCharArray();

        //using arrays.sort
        sortChar(charArrOfString);

        //using bubbleSorting
        sortCharBubbleSort(charArrOfString);

        int z = 691821;
        sortIntTreeMap(z);

    }

    public static void sortChar(char[] charArrOfString) {
        // Arrays class method to sort a char or int array
        Arrays.sort(charArrOfString);

        // convert back to string
        String ascendingArray = new String(charArrOfString);
        System.out.println(ascendingArray);

        //reversing using string builder
        String descendingArray = new StringBuilder(ascendingArray).reverse().toString();
        System.out.println(descendingArray);

    }


    public static void sortCharBubbleSort(char[] charArrOfString) {
        // get length of array
        int charArrayLength = charArrOfString.length;

        // iterate the first loop based on length
        for (int i = 0; i < charArrayLength - 1; i++) {
            // nested loop to compare and swap two numbers i.e. <current & current+1>, if first char or number is greater than second then shift first to second
            //as we are getting value of j+1 then last index should be index of last -1
            for (int j = 0; j < charArrayLength - 1 - i; j++) {
                // compare value using indexes
                if (charArrOfString[j] > charArrOfString[j + 1]) {
                    //swapping values
                    char temp = charArrOfString[j + 1];
                    charArrOfString[j + 1] = charArrOfString[j];
                    charArrOfString[j] = temp;
                }
            }
        }

        //end of loop, we have ascending sorted char array, i.e. string is sorted
        //print the charArray to String
        String ascendingArray = new String(charArrOfString);
        System.out.println(ascendingArray);

        //for descending order, you can simply reverse the array, you can also reverse the string
        String charArrReversed = reverseArr(charArrOfString);
        System.out.println(charArrReversed);

        //reversing a string

    }


    //reverse an array using for loop and index
    public static String reverseArr(char[] c) {
        String temp = "";

        for (int i = c.length - 1; i >= 0; i--) {
            temp += c[i];
        }
        return temp;
    }

    public static void sortIntTreeMap(int inputInt) {
        //occurence of each digit 691182, 112689
        int[] digits = new int[10];
        int result = 0;
        TreeMap<Integer, Integer> resMap = new TreeMap<>();

        while (inputInt != 0) {
            int indexTopush = inputInt % 10;
            resMap.put(indexTopush, resMap.getOrDefault(indexTopush, 0) + 1);
            inputInt /= 10;
        }

        for (int value : resMap.keySet()) {
            int occurence = resMap.get(value);
            for (int i =0 ;i< occurence;i++){
                result = result * 10 + value;
            }
        }
        System.out.println(result);


    }

    public static void sortIntArray(int inputInt) {
        int[] count = new int[10];   // index = digit, value = frequency

        // extract and count digits
        while (inputInt > 0) {
            int digit = inputInt % 10;
            count[digit]++;
            inputInt /= 10;
        }

        int result = 0;

        // rebuild the number in sorted order
        for (int d = 0; d <= 9; d++) {
            while (count[d] > 0) {
                result = result * 10 + d;
                count[d]--;
            }
        }

        System.out.println(result);

    }
}
