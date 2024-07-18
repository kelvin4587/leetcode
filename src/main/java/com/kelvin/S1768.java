package com.kelvin;

public class S1768 {
    public String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        char[] temp = new char[w1.length + w2.length];
        int i = 0, j = 0, k = 0;
        while (i < w1.length || j < w2.length) {
            if (i < w1.length) {
                temp[k++] = w1[i++];
            }
            if (j < w2.length) {
                temp[k++] = w2[j++];
            }
        }
        return new String(temp, 0, k);
    }
    public static void main(String[] args) {
        S1768 s1768 = new S1768();
        System.out.println(s1768.mergeAlternately("ab", "pqrs"));
    }
}
