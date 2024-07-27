package com.kelvin;

public class S3106 {
    public String getSmallestString(String s, int k) {
        char[] ans = s.toCharArray();
        for(int i = 0 ; i < ans.length ; i++){
            int distance = Math.min(ans[i] - 'a','z'-ans[i]+1);
            if(distance <= k){
                ans[i] = 'a';
                k -= distance;
            }else {
                ans[i] -= k;
                break;
            }
        }
        return new String(ans);
    }
    public static void main(String[] args) {
        S3106 s = new S3106();
        System.out.println(s.getSmallestString("xaxcd",4));
    }
}
