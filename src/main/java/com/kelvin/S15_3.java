package com.kelvin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S15_3 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        for (int first = 0; first < length; first++) {
            if (first == 0 || nums[first] != nums[first - 1]) {
                int third = length - 1;
                for (int second = first + 1; second < length; second++) {
                    if ((second == first + 1) || nums[second] != nums[second - 1]) {
                        while ((second < third) && (nums[first] + nums[second] + nums[third]) > 0) {
                            third--;
                        }
                        if (second == third) {
                            break;
                        }
                        if ((nums[first] + nums[second] + nums[third]) == 0) {
                            List<Integer> target = new ArrayList<>();
                            target.add(nums[first]);
                            target.add(nums[second]);
                            target.add(nums[third]);
                            result.add(target);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        S15_3 s = new S15_3();
        List<List<Integer>> lists = s.threeSum(nums);
        for (List<Integer> list : lists) {
            for (Integer i : list) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
}
