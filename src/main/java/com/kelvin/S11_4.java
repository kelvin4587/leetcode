package com.kelvin;

public class S11_4 {
    public int maxArea(int[] height) {
        int ans = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            ans = Math.max(area, ans);
            if (height[left] <= height[right]) {
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        S11_4 s = new S11_4();
        System.out.println(s.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
