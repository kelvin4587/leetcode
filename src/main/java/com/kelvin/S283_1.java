package com.kelvin;

public class S283_1 {
    public void moveZeroes(int[] nums) {
        int zp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zp=i;
            }
        }

    }
}
