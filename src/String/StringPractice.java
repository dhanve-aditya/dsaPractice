package String;

import java.util.Arrays;
import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String input = sc.next();

//        stringProSubString("input");
        String input = "123adit456";
//        reverseOnlyLetters(input);
        replaceLettersTwoPointer(input);
    }

    public static void stringProSubString(String s) {
        System.out.println(s.length());
        System.out.println(s.substring(1));
        System.out.println(s.substring(0, s.length()));
        System.out.println(s.indexOf("u"));
    }

    public static void reverseOnlyLetters(String s) {
        // 123adit456 r
        // 12@3#lia()
        String stringFiltered = s.replaceAll("[^a-zA-Z]", "");
        String[] strArr = stringFiltered.split("[0-9]");

        String reverrsedString = reverseTheString(stringFiltered);
        System.out.println(s.replace(stringFiltered, reverrsedString));
    }

    public static String reverseTheString(String charOrStringExtract) {
        if (charOrStringExtract.isEmpty())
            return charOrStringExtract;
        return charOrStringExtract.charAt(charOrStringExtract.length() - 1) + reverseTheString(charOrStringExtract.substring(0, charOrStringExtract.length() - 1));
    }

    public static void stringChunks(String input) {
        StringBuilder s = new StringBuilder(input);
        for (int i = 0; i < s.length(); i++) {


            char temp = input.charAt(i);
//            if (!Character.isLetter(temp))
        }

    }


    public static void replaceLettersTwoPointer(String s) {
        // 123adit456
        char[] c = s.toCharArray();
        int leftPointer = 0;
        int rightPointer = c.length - 1;

        while (leftPointer < rightPointer) {
            if (!Character.isLetter(c[leftPointer])){
                leftPointer++;
            }else if (!Character.isLetter(c[rightPointer])) {
                rightPointer--;
            }
            else {
                char temp = c[rightPointer];
                c[rightPointer] = c[leftPointer];
                c[leftPointer] = temp;
                leftPointer++;
                rightPointer--;
            }
        }

        System.out.println(Arrays.toString(c));

    }

}
