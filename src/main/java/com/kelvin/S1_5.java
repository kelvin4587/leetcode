package com.kelvin;

public class S1_5 {
    public int[] twoSum(int[] nums, int target) {
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        S1_5 s = new S1_5();
        System.out.printf("[%d,%d]", s.twoSum(nums, 9)[0], s.twoSum(nums, 9)[1]);
        int[] nums2 = {3, 2, 4};
        System.out.printf("[%d,%d]", s.twoSum(nums2, 6)[0], s.twoSum(nums2, 6)[1]);
        int[] nums3 = {3, 3};
        System.out.printf("[%d,%d]", s.twoSum(nums3, 6)[0], s.twoSum(nums3, 6)[1]);
    }
}
