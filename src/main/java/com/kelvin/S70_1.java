package com.kelvin;

public class S70_1 {
    public static int climbStairs(int n) {
        return numOfWays(n);
    }

    public static int numOfWays(int num) {
        if (num == 1) {
            return 1;
        } else if (num == 2) {
            return 2;
        } else {
            return numOfWays(num - 1) + numOfWays(num - 2);
        }
    }

    public static int rotateArray(int num) {
        int[] answers = {0, 0, 1};
        for (int step = 1; step <= num; step++) {
            answers[0] = answers[1];
            answers[1] = answers[2];
            answers[2] = answers[0] + answers[1];
        }
        return answers[2];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
        System.out.println(rotateArray(4));
    }
}
