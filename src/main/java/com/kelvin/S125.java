package com.kelvin;

public class S125 {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        char[] converted = new char[charArray.length];
        int convertedIndex = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                converted[convertedIndex++] = (char) (charArray[i] + 32);
            } else if (charArray[i] >= '0' && charArray[i] <= '9' || (charArray[i] >= 'a' && charArray[i] <= 'z')) {
                converted[convertedIndex++] = charArray[i];
            }
        }
        int left = 0;
        int right = convertedIndex - 1;
        while (left < convertedIndex) {
            if (converted[left] != converted[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        S125 s125 = new S125();
        System.out.println(s125.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(s125.isPalindrome("0P"));
        System.out.println(s125.isPalindrome("ab_a"));
    }
}
