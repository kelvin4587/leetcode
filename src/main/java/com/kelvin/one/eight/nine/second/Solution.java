package com.kelvin.one.eight.nine.second;

public class Solution {
    public void rotate(int[] nums, int k) {

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        Solution solution = new Solution();
        solution.rotate(nums, 3);
        solution.printArray(nums);

    }

    public String printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(i);
        }
        return sb.toString();
    }
}
