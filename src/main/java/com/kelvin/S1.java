package com.kelvin;

public class S1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                result[0] = i;
                result[1] = j;
            }
            i++;
            j--;
        }
        if (i + 1 == j + 1) {
            if (nums[i] + nums[i + 1] == target) {
                result[0] = nums[i];
                result[1] =  nums[i+1];
            }
            if (nums[j] + nums[j + 1] == target) {
                result[0] = nums[j];
                result[1] =  nums[j+1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        S1 s1 = new S1();
        System.out.printf("[%d,%d]", s1.twoSum2(nums, target)[0], s1.twoSum(nums, target)[1]);
        int[] nums1 = {3, 2, 4};
        int target1 = 6;
        S1 s2 = new S1();
        System.out.printf("[%d,%d]", s2.twoSum2(nums1, target1)[0], s2.twoSum(nums1, target1)[1]);
        int[] nums2 = {3, 3};
        int target2 = 6;
        S1 s3 = new S1();
        System.out.printf("[%d,%d]", s3.twoSum2(nums2, target2)[0], s3.twoSum(nums2, target2)[1]);
    }
}
