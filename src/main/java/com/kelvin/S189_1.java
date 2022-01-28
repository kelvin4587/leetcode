package com.kelvin;

import java.util.Arrays;

public class S189_1 {

    public void rotate(int[] nums, int k) {
        for (int j = 1; j <= k; j++) {
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        S189_1 s189_1 = new S189_1();
        s189_1.rotate(data,3);
        System.out.println(Arrays.toString(data));
    }
}
