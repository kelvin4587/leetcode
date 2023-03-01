package com.kelvin;

import java.util.Arrays;

public class S42_2 {

    public int trapByRow(int[] height) {
        int result = 0;
        int max = findMaxHeight(height);
        for (int i = 1; i <= max; i++) {
            boolean startEnable = false;
            int temp = 0;
            for (int j = 0; j < height.length; j++) {
                if (startEnable && i > height[j]) {
                    temp++;
                }
                if (i <= height[j]) {
                    result += temp;
                    temp = 0;
                    startEnable = true;
                }
            }
        }
        return result;
    }

    public int trapByColumn(int[] height) {
        int result = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int min = Math.min(leftMaxHeight(height, i), rightMaxHeight(height, i));
            if (height[i] < min) {
                int traps = min - height[i];
                result += traps;
            }
        }
        return result;
    }
    public int trapByColumnArray(int[] height) {
        int result = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int min = Math.min(leftMaxHeight(height, i), rightMaxHeight(height, i));
            if (height[i] < min) {
                int traps = min - height[i];
                result += traps;
            }
        }
        return result;
    }

    public int[] leftMaxHeightArray(int[] height) {
        int[] leftMaxes = new int[height.length];
        for (int i = 1; i < height.length-1; i++) {
            leftMaxes[i]=Math.max(leftMaxes[i-1],height[i]);
        }
        return leftMaxes;
    }

    private int leftMaxHeight(int[] height, int index) {
        int max = 0;
        for (int i = index - 1; i >= 0; i--) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        return max;
    }

    private int rightMaxHeight(int[] height, int index) {
        int max = 0;
        for (int i = index + 1; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        return max;
    }

    private int findMaxHeight(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        S42_2 s42_2 = new S42_2();
        int[] ints = s42_2.leftMaxHeightArray(height);
        System.out.println(Arrays.toString(ints));
        System.out.println(s42_2.trapByRow(height));
        System.out.println(s42_2.trapByColumn(height));
    }

}
