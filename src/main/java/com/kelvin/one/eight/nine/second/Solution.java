package com.kelvin.one.eight.nine.second;

public class Solution {
    public void rotate(int[] nums, int k) {
<<<<<<< HEAD

=======
        int offset = k;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            offset = i + offset;
            if (offset < nums.length) {
                nums[i] = nums[offset];
                i = offset;
            } else {
                nums[i] = nums[offset - nums.length];
            }
        }
>>>>>>> f975dc112a5f960886f547c12147a6649ecdedb7
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
<<<<<<< HEAD
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
=======
        new Solution().rotate(nums, 3);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
>>>>>>> f975dc112a5f960886f547c12147a6649ecdedb7
    }
}
