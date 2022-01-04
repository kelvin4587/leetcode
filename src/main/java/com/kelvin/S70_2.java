package com.kelvin;

public class S70_2 {
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }

    public static int climbStairs2(int n) {
        int[] result = {1, 2, 3};
        if (n == 1) {
            return result[0];
        } else if (n == 2) {
            return result[1];
        } else if (n == 3) {
            return result[2];
        } else {
            for (int i = 3; i < n; i++) {
                result[0] = result[1];
                result[1] = result[2];
                result[2] = result[0] + result[1];
            }
            return result[2];
        }
    }

    public static void main(String[] args) {
        System.out.println(climbStairs2(16));
        System.out.println(climbStairs(16));
    }
}
