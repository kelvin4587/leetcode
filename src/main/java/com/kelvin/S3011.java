package com.kelvin;

public class S3011 {
    public boolean canSortArray(int[] nums) {
        int lastCnt = 0;
        int lastGroupMax = 0;
        int curGroupMax = 0;
        for(int num : nums){
            int curCnt = Integer.bitCount(num);
            if(curCnt == lastCnt){
                curGroupMax = Math.max(curGroupMax,num);
            }else{
                lastCnt = curCnt;
                lastGroupMax = curGroupMax;
                curGroupMax = num;
            }
            if(num < lastGroupMax){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        S3011 s3011 = new S3011();
        System.out.println(s3011.canSortArray(new int[]{8,4,2,30,15}));
        System.out.println(s3011.canSortArray(new int[]{1,2,3,4,5}));
        System.out.println(s3011.canSortArray(new int[]{3,16,8,4,2}));
    }
}
