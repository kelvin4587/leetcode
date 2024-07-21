package com.kelvin;

public class S1186 {
    public int maximumSum(int[] arr){
        int dp0 = arr[0],dp1 = 0,res = arr[0];
        for(int i = 1; i < arr.length; i++){
            dp1 = Math.max(dp0, dp1 + arr[i]);
            dp0 = Math.max(dp0, 0) + arr[i];
            res = Math.max(res, Math.max(dp1, dp0));
        }
        return res;
    }
    public static void main(String[] args) {
        S1186 s1186 = new S1186();
        System.out.println(s1186.maximumSum(new int[]{1,-2,0,3}));
    }
}
