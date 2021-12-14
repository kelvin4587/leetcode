package com.kelvin;


public class Solution1_2 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = nums[i];
                    result[1] = nums[j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution1_2 solution1_2 = new Solution1_2();
        int[] ints = solution1_2.twoSum(nums, target);
        System.out.printf("[%d,%d]", ints[0], ints[1]);

    }
}
