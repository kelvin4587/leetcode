package com.kelvin;

public class S3101 {
    public long countAlternatingSubarrays(int[] nums) {
        long res=0,cur=0;
        int pre = -1;
        for(int num:nums){
            cur = (pre!=num)? cur+1:1;
            pre = num;
            res += cur;
        }
        return res;
    }

    public static void main(String[] args) {
        S3101 s3101 = new S3101();
        System.out.println(s3101.countAlternatingSubarrays(new int[]{0,1,1,1}));
        System.out.println(s3101.countAlternatingSubarrays(new int[]{1,0,1,0}));
    }
}
