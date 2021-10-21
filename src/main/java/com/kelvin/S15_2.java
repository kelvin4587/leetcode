package com.kelvin;

import java.util.*;

public class S15_2 {
    public static List<Integer> addAnswer(int x, int y, int z) {
        List<Integer> an = new ArrayList<>();
        an.add(x);
        an.add(y);
        an.add(z);
        return an;
    }

    public static List<List<Integer>> threeSum3LoopImprove(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int k = n - 1;
                for (int j = i + 1; j < n; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        while (nums[i] + nums[j] + nums[k] > 0) {
                            k--;
                        }
                        if (j < k) {
                            if (nums[i] + nums[j] + nums[k] == 0) {
                                answer.add(addAnswer(nums[i], nums[j], nums[k]));
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }

    public static List<List<Integer>> threeSum3Loop(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < n; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        for (int k = j + 1; k < n; k++) {
                            if (k == j + 1 || nums[k] != nums[k - 1]) {
                                if (nums[i] + nums[j] + nums[k] == 0) {
                                    answer.add(addAnswer(nums[i], nums[j], nums[k]));
                                }
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> minusSumKey = new HashSet<>();
        int zeroIndex = -1;
        while (i < j) {
            int oj = j;
            while (i < j) {
                int sum = nums[i] + nums[j];
                for (int k = i + 1; k < j; k++) {
                    if (nums[k] == 0) {
                        zeroIndex = k;
                    }
                    if (sum == 0 && zeroIndex != -1) {
                        ans.add(addAnswer(nums[i], nums[j], nums[zeroIndex]));
                    } else if (sum == -nums[k]) {
                        if (!minusSumKey.contains(-nums[k])) {
                            ans.add(addAnswer(nums[i], nums[j], nums[k]));
                            minusSumKey.add(-nums[k]);
                            minusSumKey.add(-(nums[k] + nums[j]));
                            minusSumKey.add(-(nums[k] + nums[i]));
                        }
                    }
                }
                j--;
            }
            j = oj;
            i++;
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum3LoopImprove(nums);
        for (List<Integer> l : lists) {
            for (Integer i : l) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
}
