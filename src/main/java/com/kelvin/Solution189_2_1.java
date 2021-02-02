package com.kelvin;

import java.util.Arrays;

/**
 * @author kelvin
 * @date 2021/1/31 11:25 AM
 */
public class Solution189_2_1 {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int step = 1;
        while(step<=k){
            moveOneStep(nums);
            step++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        Arrays.stream(nums).forEach((num) -> System.out.printf("%s ", num));
        rotate(nums,3);
        System.out.println();
        Arrays.stream(nums).forEach((num) -> System.out.printf("%s ", num));
    }

    public static void moveOneStep(int[] nums) {
        int last = nums.length - 1;
        for (int i = last; i > 0; i--) {
            int temp = nums[i];
            nums[i] = nums[i - 1];
            nums[i - 1] = temp;

        }
    }

}
