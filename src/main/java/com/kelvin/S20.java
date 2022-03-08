package com.kelvin;

import java.util.HashMap;
import java.util.Map;

public class S20 {
    public boolean isValid(String s){
        int length=s.length();
        if(length%2!=0){
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        map.put(']','[');
        return true;
    }

}
