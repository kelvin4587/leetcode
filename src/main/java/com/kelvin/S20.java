package com.kelvin;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class S20 {
    public boolean isValid(String s) {
        int length = s.length();
        if (length % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap() {{
            put(']', '[');
            put('}', '{');
            put(')', '(');
        }};
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                if (stack.isEmpty() || !map.get(c).equals(stack.peek())) {
                    return false;
                }
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "([)]";
        String s4 = "(]";
        String s5 = "{[]}";
        S20 s = new S20();
        System.out.printf("%s:%b",s1,s.isValid(s1));
        System.out.printf("%s:%b",s2,s.isValid(s2));
        System.out.printf("%s:%b",s3,s.isValid(s3));
        System.out.printf("%s:%b",s4,s.isValid(s4));
        System.out.printf("%s:%b",s5,s.isValid(s5));
    }
}
