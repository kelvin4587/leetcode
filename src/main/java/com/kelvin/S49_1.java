package com.kelvin;

import java.util.*;

public class S49_1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagramsOrderByArray(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            int[] alphabet = new int[26];
            for (int i = 0; i < chars.length; i++) {
                alphabet[chars[i] - 'a']++;
            }
            StringBuilder sb= new StringBuilder();
            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i] != 0) {
                    char c = (char) ('a' + i);
                    sb.append(c);
                    sb.append(alphabet[i]);
                }
            }
            String key = sb.toString();
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        S49_1 s49_1 = new S49_1();
        List<List<String>> lists = s49_1.groupAnagrams(strs);
        System.out.println(Arrays.toString(lists.toArray()));
        List<List<String>> lists2 = s49_1.groupAnagramsOrderByArray(strs);
        System.out.println(Arrays.toString(lists2.toArray()));
    }
}
