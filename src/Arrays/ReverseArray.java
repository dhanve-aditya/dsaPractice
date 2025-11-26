package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {

    public static void main(String[] args) {

        //reverse an array
        reverseTheArray(new int[]{2, 3, 5, 6, 78, 93});
        //reverse an array of Strings
        reverseStringArray(new String[]{"adi", "uma", "ank", "dat"});
        //reverse an array of charcters
        reverseCharArray(new char[]{'a', 'b', 'c', 'd'});

        reverseArrayList();
    }


    /**
     * Given an array of any data type, we can reverse it by simply swappling the values using two pointer technique
     * Need to use a temp varaible whose data type should be same as the datatype of Arraay
     *
     * @param a
     */
    public static void reverseTheArray(int[] a) {
        int leftPointer = 0;
        int rightPointer = a.length - 1;

        while (leftPointer < rightPointer) {
            int temp = a[leftPointer];
            a[leftPointer] = a[rightPointer];
            a[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }

        System.out.println(Arrays.toString(a));

    }


    public static void reverseStringArray(String[] a) {
        int leftPointer = 0;
        int rightPointer = a.length - 1;

        while (leftPointer < rightPointer) {
            String temp = a[rightPointer];
            a[rightPointer] = a[leftPointer];
            a[leftPointer] = temp;
            leftPointer++;
            rightPointer--;
        }

        System.out.println(Arrays.toString(a));
    }

    public static void reverseCharArray(char[] a) {
        int leftPointer = 0;
        int rightPointer = a.length - 1;

        while (leftPointer < rightPointer) {
            char temp = a[rightPointer];
            a[rightPointer] = a[leftPointer];
            a[leftPointer] = temp;
            leftPointer++;
            rightPointer--;
        }

        System.out.println(Arrays.toString(a));
    }


    public static void reverseArrayList() {
        List<Integer> ls = new ArrayList<>();
        ls.add(2);
        ls.add(4);
        ls.add(6);
        ls.add(3);

        System.out.println(ls);

        int leftPointer = 0;
        int rightpointer = ls.size()-1;

        while (leftPointer<rightpointer){
            int temp = ls.get(rightpointer);
            ls.set(rightpointer, ls.get(leftPointer));
            ls.set(leftPointer, temp);
            leftPointer++;
            rightpointer--;
        }

        System.out.println("After sorting");
        System.out.println(ls);
    }

}
