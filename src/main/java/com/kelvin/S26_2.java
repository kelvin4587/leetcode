package com.kelvin;

import java.util.Arrays;

public class S26_2 {
    public int removeDuplicates(int[] nums) {
        //check
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int p = 0;
        int q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }


    public static void main(String[] args) {
        int[] test = {1, 1, 2};
        S26_2 s26_1 = new S26_2();
        int i = s26_1.removeDuplicates(test);
        System.out.println(Arrays.toString(test));
        System.out.println(i);
    }
}
