package com.kelvin;

import java.util.Arrays;

public class Solution26_1 {
    public static int removeDuplicates(int[] nums) {
        int i = 0, j = 1, k = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                n=move(nums, i, j, n);
                i++;
            }
        }
        return n;
    }

    public static int move(int[] nums, int i, int j, int n) {
        int step = j - i - 1;
        n = n - step;
        for (int k = i + 1; k < n; k++) {
            int temp = nums[k];
            nums[k] = nums[k + step];
            nums[k + step] = temp;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 5};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
