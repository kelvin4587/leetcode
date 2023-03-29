package com.kelvin;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

public class S242_1 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> mapS = convertToMap(s);
        Map<Character, Integer> mapT = convertToMap(t);
        Set<Character> keys = mapS.keySet();
        for (Character key : keys) {
            if (!mapS.get(key).equals(mapT.get(key))) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagramAnswer(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] alphabet = new int[26];
        for (int i = 0; i < s.toCharArray().length; i++) {
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) {
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> convertToMap(String s) {
        Map<Character, Integer> result = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!result.containsKey(chars[i])) {
                result.put(chars[i], 1);
            } else {
                Integer counter = result.get(chars[i]);
                counter++;
                result.put(chars[i], counter);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        S242_1 s242_1 = new S242_1();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(s242_1.isAnagram(s, t));
        System.out.println(s242_1.isAnagramAnswer(s, t));
    }
}
