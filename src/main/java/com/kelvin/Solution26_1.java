package com.kelvin;

import java.util.Arrays;

public class Solution26_1 {
    public static int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == nums[j]) {
                j++;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 5};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
