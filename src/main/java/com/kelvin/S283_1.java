package com.kelvin;

import java.util.Arrays;

public class S283_1 {
    public static void moveZeroes(int[] nums) {
        int zp = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zp = swapFromTo(nums, i, zp);
            }
        }
    }

    public static int swapFromTo(int[] nums, int from, int to) {
        for (int i = from; i < to; i++) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        return to - 1;
    }

    public static void main(String[] args) {
        int[] data = {0, 1, 0, 3, 12};
        moveZeroes(data);
        System.out.println(Arrays.toString(data));
    }
}
