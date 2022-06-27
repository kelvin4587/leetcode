package com.kelvin;

public class S11_3 {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int result = 0;
        while (i < j) {
            if (height[i] < height[i + 1]) {
                i++;
            }
            if (height[j] < height[j - 1]) {
                j--;
            }
            int h = this.min(height[i], height[j]);
            int d = j - i;
            if (h * d > result) {
                result = h * d;
            }
            if (height[i] > height[j]) {
                i++;
            }else{
                j--;
            }
        }
        return result;
    }

    private int min(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        S11_3 s = new S11_3();
        System.out.println(s.maxArea(nums));
    }
}
