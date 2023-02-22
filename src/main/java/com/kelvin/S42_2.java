package com.kelvin;

public class S42_2 {

    public int trap(int[] height) {
        int result = 0;
        int max = findMaxHeight(height);
        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < height.length; i++) {
                int temp = 0;
                if (i < height[j]) {
                    temp++;
                } else {
                    result += temp;
                    temp = 0;
                }
            }
        }
        return result;
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

    }

}
