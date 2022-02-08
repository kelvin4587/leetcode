package com.kelvin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class S66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 > 9) {
                digits[i] = (digits[i] + 1) % 10;
                if (i == 0) {
                    return addMore(digits);
                }
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
        }
        return digits;
    }

    public int[] plusOne2(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            if (digits[i] != 9) {
                ++digits[i];
                for (int j = i + 1; j < n; ++j) {
                    digits[j] = 0;
                }
                return digits;
            }
        }

        // digits 中所有的元素均为 9
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }

    private int[] addMore(int[] digits) {
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            result[i] = digits[i - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {9,3,9,9};
        S66 s66 = new S66();
        int[] ints = s66.plusOne2(nums);
        System.out.println(Arrays.toString(ints));
    }
}
