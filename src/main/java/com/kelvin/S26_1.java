package com.kelvin;

public class S26_1 {
    public int removeDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            while (j < nums.length) {
                if (nums[i] == nums[j]) {
                    j++;
                }
            }


        }
        return 0;
    }

    public int moveArray(int[] nums, int start, int end) {
        int steps = end - start + 1;
        int length = nums.length - steps;
        for (int i = start + 1; i < length; i++) {

        }
        return length;
    }

    public static void main(String[] args) {

    }
}
