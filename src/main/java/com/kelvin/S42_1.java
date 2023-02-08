package com.kelvin;

import java.util.Arrays;

public class S42_1 {
    public int trap(int[] height) {
        int max = height[0];
        int traps = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j < height.length - 1; j++) {
                if (height[j - 1] > height[j] && height[j + 1] > height[j]) {
                    int min = height[j - 1] < height[j + 1] ? height[j - 1] : height[j + 1];
                    int rowTrap = min - height[j] - i;
                    if (rowTrap >= 1) {
                        traps = traps + rowTrap;
                    }
                }
            }
        }
        return traps;
    }

    public int trapRow(int[] height) {
        int max = fetchMax(height);
        int traps = 0;
        for (int i = 1; i <= max; i++) {
            boolean isStart = false;
            int tempSum = 0;
            for (int j = 0; j < height.length; j++) {
                if (isStart && height[j] < i) {
                    tempSum++;
                }
                if (height[j] >= i) {
                    traps = traps + tempSum;
                    tempSum = 0;
                    isStart = true;
                }

            }
        }
        return traps;
    }

    public int trapLine(int[] height) {
        int traps = 0;
        for (int i = 1; i < height.length; i++) {
            int[] result = fetchLeftRightMax(height, i);
            int min = result[0] < result[1] ? result[0] : result[1];
            if (height[i] < min) {
                int trapLine = min - height[i];
                traps += trapLine;
            }
        }
        return traps;
    }

    public int[] fetchLeftRightMax(int[] height, int index) {
        int[] result = new int[2];
        int leftMax = 0;
        int rightMax = 0;
        for (int i = 0; i < index; i++) {
            if (height[i] > leftMax) {
                leftMax = height[i];
            }
        }
        for (int i = height.length - 1; i > index; i--) {
            if (height[i] > rightMax) {
                rightMax = height[i];
            }
        }
        result[0] = leftMax;
        result[1] = rightMax;
        return result;
    }


    public int fetchMax(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        return max;
    }

    public int[] fetchMaxLeft(int[] height) {
        int[] maxLeft = new int[height.length];
        for (int i = 1; i < height.length; i++) {
            maxLeft[i] = max(maxLeft[i - 1], height[i - 1]);
        }
        return maxLeft;
    }

    public int[] fetchMaxRight(int[] height) {
        int[] maxRight = new int[height.length];
        for (int i = height.length - 2; i >= 0; i--) {
            maxRight[i] = max(maxRight[i + 1], height[i + 1]);
        }
        return maxRight;
    }


    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        S42_1 s42_1 = new S42_1();
        int e1[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//        System.out.println(s42_1.trapRow(e1));
//        System.out.println(s42_1.trapLine(e1));
        System.out.println(Arrays.toString(s42_1.fetchMaxLeft(e1)));
        System.out.println(Arrays.toString(s42_1.fetchMaxRight(e1)));
    }
}
