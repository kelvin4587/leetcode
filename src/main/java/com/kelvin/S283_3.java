package com.kelvin;

import java.util.Arrays;

public class S283_3 {
    public void moveZeroes(int[] nums) {
        int length = nums.length - 1;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < length; j++) {
                    nums[j] = nums[j + 1];
                }
                length--;
            }
        }
        for (int k = length + 1; k < nums.length; k++) {
            nums[k] = 0;
        }
    }


    public static void main(String[] args) {
        int[] data = {0, 1, 0, 3, 12};
        S283_3 s = new S283_3();
        s.moveZeroes(data);
        System.out.println(Arrays.toString(data));
    }
}
