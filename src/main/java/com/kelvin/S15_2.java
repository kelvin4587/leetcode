package com.kelvin;

import java.util.*;

public class S15_2 {
    public static List<List<Integer>> threeSum(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> minusSumKey= new HashSet<>();
        while (i < j) {
            int oj=j;
            while (i < j) {
                int sum = nums[i] + nums[j];
                for (int k = i + 1; k < j; k++) {
                    if (sum == -nums[k]) {
                        if(!minusSumKey.contains(-nums[k])) {
                            List<Integer> an = new ArrayList<>();
                            an.add(nums[i]);
                            an.add(nums[j]);
                            an.add(nums[k]);
                            ans.add(an);
                            minusSumKey.add(-nums[k]);
                            minusSumKey.add(-(nums[k]+nums[j]));
                        }
                    }
                }
                j--;
            }
            j=oj;
            i++;
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);
        for (List<Integer> l : lists) {
            for (Integer i : l) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
}
