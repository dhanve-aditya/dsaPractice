package String;

import java.util.HashMap;
import java.util.Map;

public class StringVowels {

    public static void main(String[] args) {
        String s = "AdityaTest";
        //count the total number of vowels, both lower & upper case
        System.out.println(countVowels(s));

        //print the vowels present in the string and it's occurences
        vowelOccurences(s);

        //reverse just the vowels within a String
        vowelReverse(s);

        //replace all the vowels in string with x
        replaceVowels(s);

    }

    /**
     * Count total number of vowel characters in a String
     * Create a string literal s=aeiouAEIOU, create char array of string
     * use indexOf to checek if char if chdar
     *
     * @param s
     * @return
     */
    public static int countVowels(String s) {
        String vowels = "aeiouAEIOU";
        s = s.replaceAll("\\s+", "").replaceAll("\\W+", "");
        int numberOfVowels = 0;
        char[] c = s.toCharArray();
        for (char output : c) {
            if (vowels.indexOf(output) != -1)
                numberOfVowels++;
        }

        return numberOfVowels;
    }

    /**
     * Use a hashmap to store vowels from a string and then increment the occurrence. Result should be the vowel as key and no of that vowel as value
     *
     * @param s
     */
    public static void vowelOccurences(String s) {
        String vowel = "aeiouAEIOU";
        Map<Character, Integer> result = new HashMap<>();
        char[] c = s.toCharArray();

        for (char a : c) {
            if (vowel.indexOf(a) != -1)
                result.put(a, result.getOrDefault(a, 0) + 1);
        }

        for (char a : result.keySet()) {
            System.out.println(a + "-" + result.get(a));
        }

    }

    /**
     * Reverse only the vowels in the String, using two pointer technique and indexOf method from strings, ifIndexOf something is not vowel then increment decrement pointers
     *
     * @param s
     */
    public static void vowelReverse(String s) {
        char[] c = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int leftPointer = 0;
        int rightPointer = c.length - 1;

        while (leftPointer < rightPointer) {
            if (vowels.indexOf(c[leftPointer]) == -1)
                leftPointer++;
            else if (vowels.indexOf(c[rightPointer]) == -1)
                rightPointer--;
            else {
                char temp = c[rightPointer];
                c[rightPointer] = c[leftPointer];
                c[leftPointer] = temp;
                leftPointer++;
                rightPointer--;
            }
        }

        System.out.println(new String(c));
    }

    /**
     * Replace only the vowels of a string, can use string.replaceAll regex functions or iterate and replace by camparing vowel string to indiv char array
     * @param s
     */
    public static void replaceVowels(String s) {
//        s = s.replaceAll("[aeiouAEIOU]","x");
//        System.out.println(s);

        String vowels = "aeiouAEIOU";
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (vowels.indexOf(c[i]) != -1)
                c[i] = 'x';
        }

        System.out.println(String.valueOf(c));
    }

}
