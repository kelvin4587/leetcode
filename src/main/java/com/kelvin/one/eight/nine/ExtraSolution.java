package com.kelvin.one.eight.nine;

public class ExtraSolution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[(i+k)%nums.length]=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=temp[i];
        }
    }
}
