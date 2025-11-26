package Arrays;

public class SearchInArray {

    /**
     * Search a particular value within an array and return the index of it
     * @param args
     */


    public static void main(String[] args) {
        int[] a = {4, 5, 6, 9, 11, 2233, 45, 67};

//        System.out.println(searchTarget(a));
//        System.out.println(searchBinaryTarget(a));
        System.out.println(binarySearchUsingRecursion(a,11,0, a.length-1));

    }

    // simple and time consuming
    // linear search
    public static int searchTarget(int[] a) {
        int target = 11;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //binary search
    public static int searchBinaryTarget(int[] a) {
        int startIndex = 0;
        int endIndex = a.length - 1;
        int target = 11;

        while (startIndex<=endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            if (a[middleIndex] == target) {
                return middleIndex;
            } else if (a[middleIndex] < target)
                startIndex = middleIndex + 1;
            else
                endIndex = middleIndex - 1;

        }
        return -1;
    }


    public static int binarySearchUsingRecursion(int[] a, int target, int startIndex, int endIndex){
        int middleIndx = (startIndex+endIndex)/2;
        if(a[middleIndx]==target){
            return middleIndx;
        }else if(a[middleIndx]<target)
            return binarySearchUsingRecursion(a,target,middleIndx+1,endIndex);
        else
            return binarySearchUsingRecursion(a,target,middleIndx,endIndex-1);

    }


}
