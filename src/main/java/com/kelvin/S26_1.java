package com.kelvin;

public class S26_1 {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int j = i + 1;
            while (j < length) {
                if (nums[i] == nums[j]) {
                    j++;
                }else{
                    length=this.moveArray(nums,i,j);length=this.moveArray(nums,i,j);
                    break;
                }
            }
        }
        return length;
    }

    public int moveArray(int[] nums, int start, int end) {
        int steps = end - start - 1 ;
        int length = nums.length - steps;
        for (int i = start + 1; i < length; i++) {
            nums[i] = nums[i+steps];
        }
        return length;
    }

    public static void main(String[] args) {
        int[] test = {1,1,2};
        S26_1 s26_1 = new S26_1();
        int i = s26_1.removeDuplicates(test);
        System.out.println(test);
        System.out.println(i);
    }
}
