package com.kelvin;

public class S2970 {
    public int incremovableSubarrayCount(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(j>=i) {
                    int[] subArray = this.subArray(nums, i, j);
                    if (this.ascendingArray(subArray)) {
                        res++;
                    }
                }
            }
        }
        return res;
    }

    public int incremovableSubarrayCount2(int[] nums) {
        int n = nums.length;
        int res = 0;
        int l = 1;
        while (l < n && nums[l - 1] < nums[l]) {
            l++;
        }
        res += l + (l < n ? 1 : 0);
        for (int r = n - 2; r >= 0; r--) {
            while (l > 0 && nums[l - 1] >= nums[r + 1]) {
                l--;
            }
            res += l + (l <= r ? 1 : 0);
            if (nums[r] >= nums[r+1]) {
                break;
            }
        }
        return res;
    }

    public int[] subArray(int[] nums, int start, int end) {
        int[] res = new int[nums.length - (end - start + 1)];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (i >= start && i <= end) {
                continue;
            } else {
                res[j] = nums[i];
                j++;
            }
        }
        return res;
    }

    public boolean ascendingArray(int[] nums) {
        if(nums.length==0){
            return true;
        }else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] >= nums[i + 1]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        S2970 obj = new S2970();
        System.out.println(obj.incremovableSubarrayCount(new int[]{1, 2, 3, 4}));
        System.out.println(obj.incremovableSubarrayCount(new int[]{6, 5, 7, 8}));
        System.out.println(obj.incremovableSubarrayCount(new int[]{8, 7, 6, 6}));
    }
}
