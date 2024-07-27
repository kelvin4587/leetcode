package com.kelvin;

public class S334 {
    public boolean increasingTriplet(int[] nums) {
        int first = nums[0];
        int second = Integer.MAX_VALUE;
        for(int num : nums){
            if(num > second){
                return true;
            }else if(num > first){
                second = num;
            }else {
                first = num;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        S334 s334 = new S334();
        System.out.println(s334.increasingTriplet(new int[]{1,2,3}));
    }
}
