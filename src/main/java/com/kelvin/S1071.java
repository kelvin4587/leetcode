package com.kelvin;

public class S1071 {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length(),len2 = str2.length();
        for(int i=Math.min(len1,len1);i>=1;--i){
            if(len1%i==0 && len2%i==0){
                String x = str1.substring(0,i);
                if(check(x,str1)&&check(x,str2)){
                    return x;
                }
            }
        }
        return "";
    }
    public boolean check(String t, String s){
        int lenx = s.length()/t.length();
        StringBuffer ans = new StringBuffer();
        for(int i=0;i<lenx;i++){
            ans.append(t);
        }
        return ans.toString().equals(s);
    }
    public static void main(String[] args) {
        S1071 s1071 = new S1071();
        System.out.println(s1071.gcdOfStrings("ABCABC","ABC"));
        System.out.println(s1071.gcdOfStrings("ABABAB","ABAB"));
        System.out.println(s1071.gcdOfStrings("LEFT","CODE"));
    }
}
