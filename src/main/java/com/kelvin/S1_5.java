package com.kelvin;

import java.util.HashMap;
import java.util.Map;

public class S1_5 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            int num2 = target - num1;
            if (map.containsKey(num2)) {
                result[0] = map.get(num2);
                result[1] = i;
            } else {
                map.put(num1, i);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        S1_5 s = new S1_5();
        System.out.printf("[%d,%d]", s.twoSum(nums, 9)[0], s.twoSum(nums, 9)[1]);
        int[] nums2 = {3, 2, 4};
        System.out.printf("[%d,%d]", s.twoSum(nums2, 6)[0], s.twoSum(nums2, 6)[1]);
        int[] nums3 = {3, 3};
        System.out.printf("[%d,%d]", s.twoSum(nums3, 7)[0], s.twoSum(nums3, 7)[1]);
    }
}
