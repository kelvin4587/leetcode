package com.kelvin;

public class S494 {
    int count = 0;
    public int findTargetSumWays(int[] nums,int target){
        backTrack(nums,target,0,0);
        return count;
    }
    public void backTrack(int[] nums,int target,int index,int sum){
        if(index==nums.length){
            if(sum==target){
                count++;
            }
        }else{
            backTrack(nums,target,index+1,sum+nums[index]);
            backTrack(nums,target,index+1,sum-nums[index]);
        }
    }

    public static void main(String[] args) {
        S494 s = new S494();
        int[] nums = {1,1,1,1,1};
        System.out.println(s.findTargetSumWays(nums,3));
    }
}
