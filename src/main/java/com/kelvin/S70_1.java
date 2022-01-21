package com.kelvin;

public class S70_1 {
    public static int climbStairs(int n) {
        // 同问这个矩阵怎么出的
        int[][] q = {{1, 1}, {1, 0}};
        int[][] res = pow(q, n);
        return res[0][0];
    }

    public static int[][] pow(int[][] a, int n) {
        // 这个矩阵怎么出的
        int[][] ret = {{1, 0}, {0, 1}};
        while (n > 0) {
            if ((n & 1) == 1) {
                ret = multiply(ret, a);
            }
            n >>= 1;
            a = multiply(a, a);
        }
        return ret;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
            }
        }
        return c;
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
    }
}
