package com.kelvin;

public class S334_1 {
    public boolean increasingTriplet(int[] nums) {
        int[] leftMin = new int[nums.length];
        int[] rightMax = new int[nums.length];
        leftMin[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], nums[i]);
        }
        rightMax[nums.length - 1] = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
        }
        boolean result = false;
        for(int i=0;i<nums.length;i++){
            if(leftMin[i]<nums[i]&&nums[i]<rightMax[i]){
                result = true;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        S334_1 s334 = new S334_1();
        System.out.println(s334.increasingTriplet(new int[]{1,2,3}));
    }
}
