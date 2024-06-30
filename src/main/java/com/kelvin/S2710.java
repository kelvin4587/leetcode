package com.kelvin;

public class S2710 {
    public String removeTrailingZeros(String num) {
        char[] charArray = num.toCharArray();
        int size = charArray.length;
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == '0') {
                size--;
            }else{
                break;
            }
        }
        char[] result = new char[size];
        for (int i = 0; i < size; i++) {
            result[i]=charArray[i];
        }
        return new String(result);
    }

    public static void main(String[] args) {
        S2710 s = new S2710();
        System.out.println(s.removeTrailingZeros("51230100"));
    }
}
