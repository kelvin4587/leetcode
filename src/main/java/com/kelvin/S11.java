package com.kelvin;

public class S11 {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while (i < j) {
            int x = min(height[i], height[j]);
            int area = x * (j - i);
            if (area > max) {
                max = area;
            }
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }

    private int min(int i, int j) {
        return i < j ? i : j;
    }

    public static void main(String[] args) {
        int[] data = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        S11 s11 = new S11();
        System.out.println(s11.maxArea(data));
        int[] data1 = {1, 1};
        System.out.println(s11.maxArea(data1));
        int[] data2 = {4, 3, 2, 1, 4};
        System.out.println(s11.maxArea(data2));
        int[] data3 = {1, 2, 1};
        System.out.println(s11.maxArea(data3));
        int[] data4 = {1, 2};
        System.out.println(s11.maxArea(data4));
    }
}
