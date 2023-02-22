package com.kelvin;

public class S42_2 {

    public int trap(int[] height) {
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
        System.out.println(s42_2.trap(height));

    }

}
