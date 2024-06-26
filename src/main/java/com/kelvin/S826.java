package com.kelvin;


import javafx.util.Pair;

import java.util.*;

public class S826 {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        List<Pair<Integer, Integer>> jobs = new ArrayList<>();
        int N = profit.length, res = 0, i = 0, best = 0;
        for (int j = 0; j < N; ++j) {
            jobs.add(new Pair<Integer, Integer>(difficulty[j], profit[j]));
        }
        Collections.sort(jobs, Comparator.comparing(Pair::getKey));
        Arrays.sort(worker);
        for (int w : worker) {
            while (i < N && w >= jobs.get(i).getKey()) {
                best = Math.max(best,jobs.get(i).getValue());
                i++;
            }
            res += best;
        }
        return res;
    }

    public static void main(String[] args) {
        S826 s = new S826();
        int[] difficulty = {2, 4, 6, 8, 10};
        int[] profit = {10, 20, 30, 40, 50};
        int[] worker = {4, 5, 6, 7};
        System.out.println(s.maxProfitAssignment(difficulty, profit, worker));
    }
}
