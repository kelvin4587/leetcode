package com.kelvin;

import java.util.Arrays;

public class S283 {
    public void moveZeroes(int[] nums) {
        int end = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                moveAppendZero(nums, i, end--);
            }
        }
    }

    public void moveAppendZero(int[] nums, int begin, int end) {
        if (end > begin) {
            for (int i = begin; i < end; i++) {
                nums[i] = nums[i + 1];
            }
            nums[end] = 0;
        }
    }

    public static void main(String[] args) {
        S283 s = new S283();
        int[] nums = {0, 0, 1};
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
