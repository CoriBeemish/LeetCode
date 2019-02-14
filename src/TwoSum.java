
// 1. Two Sum
// https://leetcode.com/problems/two-sum/

// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum test = new TwoSum();

        System.out.println(Arrays.toString(test.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        int complement;
        for (int i = 0; i< nums.length; i++) {
            complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }
}
