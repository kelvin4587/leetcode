package com.kelvin;

import java.util.*;

public class S49_2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        for (String str : strs) {
            int[] alphabet = new int[26];
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                alphabet[chars[i] - 'a']++;
            }
            for (int i = 0; i < alphabet.length; i++) {

            }
        }
        return null;
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        S49_2 s49_1 = new S49_2();
        List<List<String>> lists = s49_1.groupAnagrams(strs);
        System.out.println(Arrays.toString(lists.toArray()));
    }
}
