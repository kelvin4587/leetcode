package com.kelvin;

import java.util.HashMap;
import java.util.Map;

public class S1_3 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashTable = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (hashTable.containsKey(target - nums[i])) {
                return new int[]{hashTable.get(target - nums[i]), i};
            }
            hashTable.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        S1_3 s = new S1_3();
        System.out.printf("[%d,%d]", s.twoSum(nums, 9)[0], s.twoSum(nums, 9)[1]);
        int[] nums2 = {3, 2, 4};
        System.out.printf("[%d,%d]", s.twoSum(nums2, 6)[0], s.twoSum(nums2, 6)[1]);
        int[] nums3 = {3, 3};
        System.out.printf("[%d,%d]", s.twoSum(nums3, 6)[0], s.twoSum(nums3, 6)[1]);
    }
}
