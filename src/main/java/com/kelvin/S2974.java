package com.kelvin;

import java.util.Arrays;

public class S2974 {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i+=2) {
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,4,2,3};
        S2974 s2974 = new S2974();
        System.out.println(Arrays.toString(s2974.numberGame(nums)));
    }
}
