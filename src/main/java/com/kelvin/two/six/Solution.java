package com.kelvin.two.six;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<2){
            return nums.length;
        }
        int pre = nums[0];
        int step = 0;
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            if (pre == nums[i]) {
                step++;
            } else {
                for (int j = i - step; j < length - step; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j + step];
                    nums[j + step] = temp;
                }
                i = i - step;
                pre = nums[i];
                length = length - step;
                step = 0;
            }
        }
        return length-step;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1};
        System.out.println(new Solution().removeDuplicates(nums));
    }
}
