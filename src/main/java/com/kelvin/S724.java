package com.kelvin;

public class S724 {
    public int pivotIndex(int[] nums) {
        int pivotIndex = 0;
        while (pivotIndex < nums.length) {
            int left = 0;
            int right = 0;
            for (int li = 0; li < pivotIndex; li++) {
                left += nums[li];
            }
            for (int ri = pivotIndex+1; ri < nums.length; ri++) {
                right += nums[ri];
            }
            if (left == right) {
                return pivotIndex;
            } else {
                pivotIndex++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        S724 s724 = new S724();
        System.out.println(s724.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(s724.pivotIndex(new int[]{1, 2, 3}));
        System.out.println(s724.pivotIndex(new int[]{2, 1, -1}));
    }
}
