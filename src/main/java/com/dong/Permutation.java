package com.dong;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Permutation {
    List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        backTrack(nums, track, result);
        return result;
    }

    void backTrack(int[] nums, LinkedList<Integer> track, List<List<Integer>> result) {
        if (nums.length == track.size()) {
            result.add(new LinkedList<>(track));
            return;
        }
        for (int num : nums) {
            if (track.contains(num))
                continue;
            track.add(num);
            backTrack(nums, track, result);
            track.removeLast();
        }
    }

    void printResult(List<List<Integer>> result) {
        for (List<Integer> r : result) {
            System.out.println(Arrays.toString(r.toArray()));
        }
    }

    public static void main(String[] args) {
        Permutation p = new Permutation();
        int[] nums = {1, 3, 5};
        List<List<Integer>> result=p.permute(nums);
        p.printResult(result);
    }


}
