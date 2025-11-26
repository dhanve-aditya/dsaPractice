package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * https://leetcode.com/problems/two-sum/
     *
     * @param args
     */

    public static void main(String[] args) {
        int[] input = {2, 7, 11, 15};
        int target = 22;
        System.out.println(Arrays.toString(twoSum(input, target)));
        System.out.println(Arrays.toString(hashMapSolution(input, target)));

    }

    /**
     * generic solution
     * time & space complexity > O(n2) , O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            int base = nums[i];
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }


    /**
     * optimised using hashmap
     */
    public static int[] hashMapSolution(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (result.containsKey(complement))
                return new int[]{result.get(complement), i};

            result.put(nums[i], i);
        }
        return null;
    }
}


