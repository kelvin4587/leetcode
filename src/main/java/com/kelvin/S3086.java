package com.kelvin;

public class S3086 {
    public long minimumMoves(int[] nums, int k, int maxChanges) {
        int n = nums.length;
        long[] indexSum = new long[n + 1], sum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            indexSum[i + 1] = indexSum[i] + nums[i] * i;
            sum[i + 1] = sum[i] + nums[i];
        }
        long res = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (f(i, nums) + maxChanges >= k) {
                if (k <= f(i, nums)) {
                    res = Math.min(res, (long) k - nums[i]);
                } else {
                    res = Math.min(res, (long) 2 * k - f(i, nums) - nums[i]);
                }
                continue;
            }
            int left = 0, right = n;
            while (left <= right) {
                int mid = (right + left) / 2;
                int i1 = Math.max(i - mid, 0), i2 = Math.min(i + mid, n - 1);
                if (sum[i2 + 1] - sum[i1] >= k - maxChanges) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            int i1 = Math.max(i - left, 0), i2 = Math.min(i + left, n - 1);
            if (sum[i2 + 1] - sum[i1] >= k - maxChanges) {
                i1++;
            }
            long count1 = sum[i + 1] - sum[i1], count2 = sum[i2 + 1] - sum[i + 1];
            res = Math.min(res, indexSum[i2 + 1] - indexSum[i + 1] - i * count2 + i * count1 - (indexSum[i + 1] - indexSum[i1]) + 2 * maxChanges);

        }
        return res;
    }

    public int f(int i, int[] nums) {
        int x = nums[i];
        if (i - 1 >= 0) {
            x += nums[i - 1];
        }
        if (i + 1 < nums.length) {
            x += nums[i + 1];
        }
        return x;
    }

    public static void main(String[] args) {
        S3086 s3086 = new S3086();
        System.out.println(s3086.minimumMoves(new int[]{1, 1, 0, 0, 0, 1, 1, 0, 0, 1}, 3, 1));
        System.out.println(s3086.minimumMoves(new int[]{0, 0, 0, 0,}, 2, 3));
    }
}
