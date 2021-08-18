package com.kelvin;

import java.util.HashMap;
import java.util.Map;

public class S1_1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i = 0;
        while (i < nums.length) {
            int number2 = target - nums[i];
            int j = i + 1;
            while (j < nums.length) {
                if (nums[j] == number2) {
                    result[0] = i;
                    result[1] = j;
                }
                j++;
            }
            i++;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.printf("[%d,%d]", S1_1.twoSum(nums, 9)[0], S1_1.twoSum(nums, 9)[1]);
        int[] nums2 = {3,2,4};
        System.out.printf("[%d,%d]", S1_1.twoSum(nums2, 6)[0], S1_1.twoSum(nums2, 6)[1]);
        int[] nums3 = {3,3};
        System.out.printf("[%d,%d]", S1_1.twoSum(nums3, 6)[0], S1_1.twoSum(nums3, 6)[1]);
    }
}
