package com.kelvin;

public class S2972 {
    public long incremovableSubarrayCount(int[] nums) {
        long ans = 0;
        int len = nums.length;
        int l = 0;
        while (l < len-1) {
            if (nums[l] >= nums[l + 1]) {
                break;
            }
            l++;
        }
        if (l == len - 1) {
            return 1L * len * (len + 1) / 2;
        }
        ans += l + 2;
        for (int r = len - 1; r > 0; r--) {
            if (r < len - 1 && nums[r] >= nums[r + 1]) {
                break;
            }
            while (l >= 0 && nums[l] >= nums[r]) {
                l--;
            }
            ans += l + 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        S2972 s = new S2972();
        System.out.println(s.incremovableSubarrayCount(new int[]{1, 2, 3, 4}));
        System.out.println(s.incremovableSubarrayCount(new int[]{6, 5, 7, 8}));
        System.out.println(s.incremovableSubarrayCount(new int[]{8, 7, 6, 6}));
    }
}
