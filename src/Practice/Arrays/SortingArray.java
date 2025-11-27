package Practice.Arrays;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {
        int[] a = {124, 2, 345, -67, 55, 3, 1, 88, 1};


//        bubbleSort(a);
//        selectionSort(a);
        insertionSort(a);
        System.out.println(Arrays.toString(a));


    }

    private static void insertionSort(int[] a) {
        // 7 3 5 9 11 13

        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j+1] = key;
        }


    }


    public static void bubbleSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

    }


    public static void selectionSort(int[] a) {
        int minIndex = -1;

        for (int i = 0; i < a.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minIndex] > a[j])
                    minIndex = j;
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }


    }
}
