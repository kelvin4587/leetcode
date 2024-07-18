package com.kelvin;

public class S2734 {
    public String smallestString(String s) {
        int indexOfFirstNonA = findFirstNonA(s);
        if(indexOfFirstNonA == s.length()){
            StringBuilder sb = new StringBuilder(s);
            sb.setCharAt(s.length()-1,'z');
            return sb.toString();
        }
        int indexOfFirstNonAAfterFirstNonA = findFirstAAfterFisrtNonA(s,indexOfFirstNonA);
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(i>=indexOfFirstNonA&& i<indexOfFirstNonAAfterFirstNonA){
                res.append((char)(c-1));
            }else {
                res.append(c);
            }
        }
        return res.toString();
    }
    public int findFirstNonA(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != 'a'){
                return i;
            }
        }
        return s.length();
    }
    public int findFirstAAfterFisrtNonA(String s,int firstNonA){
        for(int i = firstNonA; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                return i;
            }
        }
        return s.length();
    }

    public static void main(String[] args) {
        S2734 s = new S2734();
        System.out.println(s.smallestString("cbabc"));
    }
}
