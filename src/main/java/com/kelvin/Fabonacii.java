package com.kelvin;

public class Fabonacii {
    int fabonaciiNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fabonaciiNumber(n - 2) + fabonaciiNumber(n - 1);
        }
    }

    int fabonaciiNumberOptimised(int n) {
        int[] result = new int[3];
        result[0] = 1;
        result[1] = 1;
        result[2] = 1;
        for (int i = 2; i < n; i++) {
            result[0] = result[1];
            result[1] = result[2];
            result[2] = result[1] + result[0];
        }
        return result[2];
    }

    public static void main(String[] args) {
        Fabonacii fabonacii = new Fabonacii();
        long startTime = System.currentTimeMillis();
        int i = fabonacii.fabonaciiNumberOptimised(39);
        long endTime = System.currentTimeMillis();
        System.out.println(i);
        System.out.println(endTime-startTime);
        startTime = System.currentTimeMillis();
        i = fabonacii.fabonaciiNumber(39);
        endTime = System.currentTimeMillis();
        System.out.println(i);
        System.out.println(endTime-startTime);
    }
}
