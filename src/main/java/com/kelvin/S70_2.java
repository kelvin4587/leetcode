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


    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
