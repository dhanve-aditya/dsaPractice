package String;

import java.util.*;

public class Pangrams {

    // Pangrams are strings that cover every letter of alphabet at least once

    public static void main(String[] args) {
        //THe quick brown fox jumps over the lazy dog
        // fox is a healthy animal
        String a = "THe quck brown fox jumps over the lazy dog";

        //check the occurrence of characters in a string
        countTheCharacters("DonDiabloooo", 'o');

        //check if string is pangram without using collections
        checkPangramNormal(a);

        //check if string is a Pangram
        System.out.println(checkPangram(a));

//        processString();
    }

    /**
     * Check pangram without collection, use for loop with data type as char. use indexOf checks and increment if char is found. end of the program count == 26.
     * @param s
     */
    public static void checkPangramNormal(String s) {
        int count = 0;
        s = s.replaceAll("\\s+", "").replaceAll("[^a-zA-Z]", "").toLowerCase();
        for (char i = 'a'; i <= 'z'; i++) {
            if (s.indexOf(i) != -1)
                count++;
            if (count == 26)
                break;
        }

        System.out.println(count == 26 ? "Pangram" : "Not a Pangram");

    }

    /**
     * check if a string is pangram or not using collections, have used set here. min expectations will be the size of set should be equal to 26
     * before adding values into set we'll make it lowerCase and also remove values other than letters/alphabets
     *
     * @param a
     * @return
     */
    public static String checkPangram(String a) {
        a = a.replaceAll("\\s+", "").replaceAll("[^a-zA-Z]", "").toLowerCase();
        char[] c = a.toCharArray();
        Set<Character> result = new HashSet<>();

        for (char temp : c) {
            result.add(temp);
        }

        return result.size() == 26 ? "Pangram" : "Mot a Pangram";


    }

    /**
     * Count the number of times each character repeats. Using Hashmap
     *
     * @param a
     * @param search
     */
    public static void countTheCharacters(String a, char search) {
        Map<Character, Integer> result = new HashMap<>();

        for (char c : a.toCharArray()) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }

        System.out.println(result.get(search));
    }

}
