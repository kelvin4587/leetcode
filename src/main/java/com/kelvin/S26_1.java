package com.kelvin;

public class S26_1 {
    public int removeDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            while (j < nums.length) {
                if (nums[i] == nums[j]) {
                    j++;
                }
            }

        }
        return 0;
    }
    public void moveArray(int[] nums,int start,int end){

    }
    public static void main(String[] args) {

    }
}
