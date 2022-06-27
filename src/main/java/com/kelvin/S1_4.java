package com.kelvin;

public class S1_4 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        S1_4 s = new S1_4();
        System.out.printf("[%d,%d]", s.twoSum(nums, 9)[0], s.twoSum(nums, 9)[1]);
        int[] nums2 = {3, 2, 4};
        System.out.printf("[%d,%d]", s.twoSum(nums2, 6)[0], s.twoSum(nums2, 6)[1]);
        int[] nums3 = {3, 3};
        System.out.printf("[%d,%d]", s.twoSum(nums3, 6)[0], s.twoSum(nums3, 6)[1]);
    }
}
