package PracticeImpDSA;

import java.util.*;

public class DictionaryOrdering {

    // when you are given an array of strings, and you are told to sort this in aascending/dicitonary order. It is known ans lexicographical order
    // multiple ways to approach it, but my preffered will be by TreeSet or bubble sorting.
    // Here you need to know about subString and compare to methods of String class

    public static void main(String[] args) {
        String inputString = "welcometojava";
        int k = 3;
        //solve using String compareTo method for comparison
        lexicograpphy(inputString,k);

        //solved using array, LinkedList Sorting, Collections.sort,
        arraySolution(inputString,k);

        //solved using TreeSet
        treeSetSolution(inputString,k);

        getSmallestAndLargest(inputString,k);

    }

    public static void lexicograpphy(String inputString, int k) {
        String lowStr = inputString.substring(0, k);
        String highStr = inputString.substring(0, k);
        for (int i = 0; i <= inputString.length() - k; i++) {
            String baseString = inputString.substring(i, i + k);
            // returns negative if first is smaller
            if (baseString.compareTo(lowStr) < 0) {
                lowStr = baseString;
            }
            //returns positive if first is larger
            if (baseString.compareTo(highStr) > 0) {
                highStr = baseString;
            }
        }
        System.out.println(lowStr);
        System.out.println(highStr);
    }

    public static void arraySolution(String inputString, int k){
        List<String> list = new ArrayList<>();

        for (int i = 0; i <= inputString.length() - k; i++) {
            list.add(inputString.substring(i, i + k));
        }

        Collections.sort(list);

        System.out.println(list.getFirst());

        System.out.println(list.getLast());
    }


    public static void treeSetSolution(String inputString, int k){
      TreeSet<String> ts = new TreeSet<>();

        for (int i = 0; i <= inputString.length() - k; i++) {
            ts.add(inputString.substring(i, i + k));
        }

        System.out.println(ts.getFirst());

        System.out.println(ts.getLast());
    }


    public static String getSmallestAndLargest(String s, int k) {

        int n = s.length() - k + 1;
        String[] arr = new String[n];

        // Step 1: generate substrings
        for (int i = 0; i < n; i++) {
            arr[i] = s.substring(i, i + k);
        }

        // Step 2: bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // swap
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Step 3: First is smallest, last is largest
        return arr[0] + "\n" + arr[n - 1];
    }


}
