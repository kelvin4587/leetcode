package com.kelvin;

public class S345 {
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int l = 0, r = charArray.length - 1;
        while (l < r) {
            if (!isVowels(charArray[l])) {
                l++;
            }
            if (!isVowels(charArray[r])) {
                r--;
            }
            if (isVowels(charArray[l]) && isVowels(charArray[r])) {
                char temp = charArray[l];
                charArray[l] = charArray[r];
                charArray[r] = temp;
                l++;
                r--;
            }
        }
        return new String(charArray);
    }

    public boolean isVowels(char c) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++) {
            if (vowels[i] == c || vowels[i] == c + 32) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        S345 s345 = new S345();
        System.out.println(s345.reverseVowels("leetcode"));
        System.out.println(s345.reverseVowels("hello"));
    }
}
