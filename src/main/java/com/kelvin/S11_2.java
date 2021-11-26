package com.kelvin;

public class S11_2 {
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
            int min = height[i];
            if (min > height[j]) {
                min = height[j];
            }
            int distance = j - i;
            int area = min * distance;
            if (area > result) {
                result = area;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        S11_2 s = new S11_2();
        System.out.println(s.maxArea(nums));
    }
}
