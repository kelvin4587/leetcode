package com.kelvin;

import java.util.*;

public class S49_1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key,list);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        S49_1 s49_1 = new S49_1();
        List<List<String>> lists = s49_1.groupAnagrams(strs);
        System.out.println(Arrays.toString(lists.toArray()));
    }
}
