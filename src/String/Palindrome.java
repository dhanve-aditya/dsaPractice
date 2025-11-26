package String;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {

    public static void main(String[] args) {
//        palinDromchCekcheckwithoutCharArr();
//        countTheVowelsInString();
//        reverseTheVowels();
//        countCharInString();
//        replaceVowels();
//        checkPangram();
        checkPangramWithoutMap();
    }


    public static void palinDromchCekcheckwithoutCharArr() {
//        String palinDromeString = "madam";
        String palinDromeString = "A man a plan a canal   Panama";
        palinDromeString = palinDromeString.toLowerCase().replaceAll("[^a-zA-Z]", "");
        int leftPointer = 0;
        int rightPointer = palinDromeString.length() - 1;

        boolean isPlainDrome = true;
        while (leftPointer < rightPointer) {
            if (palinDromeString.charAt(leftPointer) == palinDromeString.charAt(rightPointer)) {
                leftPointer++;
                rightPointer--;
            } else {
                isPlainDrome = false;
                break;
            }
        }
        String result = isPlainDrome ? "It is a palindrome" : "Not a plaindrome";

        System.out.println(result);

    }


    //String s = icecream > vowels i,e,e,a > reversed > a,e,e,i
    public static void countTheVowelsInString() {
        String s = "UaiE0D4";
//        s = s.replaceAll("[^aeiouAEIOU]", "");
//        System.out.println(s.length());
//        // UaiE0D4
//        int count = 0;
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                System.out.print(s.charAt(i));
                count++;
            }
        }
        System.out.println(count);


    }

    public static void reverseTheVowels() {
        String s = "Holle";
        char[] sChar = s.toCharArray();
        String vowel = "aeiouAEIOU";
        int leftPointer = 0;
        int rightPointer = sChar.length - 1;

        while (leftPointer < rightPointer) {
            if (vowel.indexOf(sChar[leftPointer]) == -1)
                leftPointer++;
            else if (vowel.indexOf(sChar[rightPointer]) == -1)
                rightPointer--;
            else {
                char temp = sChar[rightPointer];
                sChar[rightPointer] = sChar[leftPointer];
                sChar[leftPointer] = temp;
                leftPointer++;
                rightPointer--;
            }
        }


        System.out.println(String.valueOf(sChar));

    }

    // program to count char in string
    public static void countCharInString() {
        String input = "madam";
        char[] inputCharArr = input.toCharArray();
        Map<Character, Integer> results = new LinkedHashMap<Character, Integer>();

        for (char x : inputCharArr) {

            results.put(x, (results.getOrDefault(x, 0) + 1));
        }
//            if (results.getOrDefault(x, 0) == 0)
//                results.put(x, 1);
//            else
//                results.put(x, results.get(x) + 1);
//        }
        System.out.println(results.toString());

    }


    //replace all the vowels in string with x
    public static void replaceVowels() {
        String input = "Hello";
        String vowels = "aeiouAEIOU";

        char[] inputArr = input.toCharArray();

        for (int i = 0; i < inputArr.length; i++) {
            if (vowels.indexOf(inputArr[i]) != -1) {
                inputArr[i] = 'x';
            }
        }

        System.out.println(new String(inputArr));
    }

    //check if a string is a pangram
    public static void checkPangram() {
        //THe quick brown fox jumps over the lazy dog
        // fox is a healthy animal
        String a = "THe quick brown fox jumps over the lazy dog";
        a = a.toLowerCase().replaceAll("\\s+", "");

        //check if string has onlly alphabets
        String removeAlpha = a.replaceAll("[a-z]", "");
        if (!removeAlpha.isEmpty())
            return;

        LinkedHashMap<Character, Integer> outputMap = new LinkedHashMap<>();

        for (char x : a.toCharArray()) {
            outputMap.put(x, outputMap.getOrDefault(x, 0) + 1);
        }

        String pangram = (outputMap.size() == 26) ? "THis is pangram" : "Not a pangram";
        System.out.println(pangram);

    }


    public static void checkPangramWithoutMap() {
        //THe quick brown fox jumps over the lazy dog
        // fox is a healthy animal
        String a = "THe quick brown fox jumps over the lazy do";
        a = a.toLowerCase().replaceAll("\\s+", "");

        if(a.length()>=26){
            for (char i='a';i<='z';i++){
                if(a.indexOf(i)<0){
                    return;
                }
            }

        }else {
            return;
        }
        System.out.println("Hell jyeahh");
    }

}
