package com.kelvin;

import java.util.HashMap;
import java.util.Map;

public class S1_2 {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; i++) {
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }
    public int[] twoSumHash(int[] nums, int target) {
        int[] result=new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
            int finder = target-nums[i];
            Integer j= map.get(finder);
            if(j!=null) {
                result[0] = j;
                result[1] = i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        S1_2 s = new S1_2();
        int[] nums = {2, 7, 11, 15};
        int[] ints = s.twoSum(nums, 9);
        System.out.printf("%d,%d", ints[0], ints[1]);
        System.out.println();
        int[] result = s.twoSumHash(nums, 9);
        System.out.printf("%d,%d", result[0], result[1]);
    }
}
