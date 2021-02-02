package com.kelvin;

import java.util.Arrays;

/**
 * @author kelvin
 * @date 2021/1/31 11:25 AM
 */
public class Solution189_2_2 {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int count = gcd(n, k);
        for (int start = 0; start < count; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;

            } while (start != current);

        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        Arrays.stream(nums).forEach((num) -> System.out.printf("%s ", num));
        rotate(nums, k);
        System.out.println();
        Arrays.stream(nums).forEach((num) -> System.out.printf("%s ", num));
    }

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

    public static int gcd2(int p, int q) {
        return q > 0 ? gcd2(q, p/ q) : p;
    }

}
