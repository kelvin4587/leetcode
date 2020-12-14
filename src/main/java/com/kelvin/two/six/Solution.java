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
                for (int j = i - step; j < length; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j + step];
                    nums[j + step] = temp;
                }
                pre = nums[i - 1];
                length = length - step;
                step = 0;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(new Solution().removeDuplicates(nums));
    }
}
