package com.kelvin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S239_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length-k+1];
        int start = 0;
        for (int i = 0; i < result.length; i++) {
            int end = start + k - 1;
            if (end >= nums.length) {
                break;
            }
            int max = Integer.MIN_VALUE;
            for (int j = start; j <= end; j++) {
                max = Integer.max(nums[j],max);
            }
            result[i] = max;
            start++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = new S239_1().maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(result));
    }
}
