package com.kelvin;

import java.util.Arrays;

public class S283_2 {
    public void moveZeroes(int[] nums) {
        int zeroIndex = nums.length;
        for (int i = 0; i < zeroIndex; i++) {
            if (nums[i] == 0) {
                move(i, zeroIndex, nums);
                zeroIndex = zeroIndex - 1;
            }
        }
        for (int i = zeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    private void move(int index, int zeroIndex, int[] nums) {
        for (int i = index; i < zeroIndex; i++) {
            if ((i + 1) < zeroIndex) {
                nums[i] = nums[i + 1];
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {0, 1, 0, 3, 12};
        S283_2 s = new S283_2();
        s.moveZeroes(data);
        System.out.println(Arrays.toString(data));
    }
}
