package com.kelvin.two.six;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int pre = nums[0];
        int step = 0;
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            if (pre == nums[i]) {
                step++;
            } else {
                pre = nums[i - 1];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    }
}
