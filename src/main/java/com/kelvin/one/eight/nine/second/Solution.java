package com.kelvin.one.eight.nine.second;

public class Solution {
    public void rotate(int[] nums, int k) {
        int offset = k;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            offset = i + offset;
            if(offset<nums.length) {
                nums[i] = nums[offset];
                nums[offset] = temp;
            }else{
                nums[i] = nums[offset-nums.length];
                nums[offset-nums.length] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
    }
}
