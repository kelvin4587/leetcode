package com.kelvin;

public class S11_1 {
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = less(height[i], height[j]) * (j - i);
        while (j > 0 && i < height.length && i != j) {
            if (height[i] < height[i + 1]) {
                i++;
            }
            if (height[j] < height[j - 1]) {
                j--;
            }
            int area = less(height[i], height[j]) * (j - i);
            if (area > max) {
                max = area;
                i++;
                j--;
            } else {
                i++;
                j--;
            }
        }
        return max;
    }

    public static int less(int i, int j) {
        return i < j ? i : j;
    }

    public static void main(String[] args) {
//        int[] data = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        System.out.println(S11_1.maxArea(data));
//        int[] data1 = {1, 1};
//        System.out.println(S11_1.maxArea(data1));
//        int[] data2 = {4, 3, 2, 1, 4};
//        System.out.println(S11_1.maxArea(data2));
        int[] data3 = {1, 2, 1};
        System.out.println(S11_1.maxArea(data3));
        int[] data4 = {1, 2};
        System.out.println(S11_1.maxArea(data4));
    }
}
