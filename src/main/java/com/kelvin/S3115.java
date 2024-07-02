package com.kelvin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S3115 {
    public int maximumPrimeDifference(int[] nums) {
        int firstPrimeIndex = -1;
        int lastPrimeIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i])){
                if(firstPrimeIndex==-1){
                    firstPrimeIndex=i;
                }
                if(lastPrimeIndex<i){
                    lastPrimeIndex=i;
                }
            }
        }
        return lastPrimeIndex-firstPrimeIndex;
    }
    private boolean isPrime(int number){
        if(number>1) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0 && i != 1 && i != number) {
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }
    public int[] primeArray(int topNumber){
        List<Integer> result = new ArrayList<>();
        for(int i=2;i<=topNumber;i++){
            if(this.isPrime(i)) {
                result.add(i);
            }
        }
        int[] array = new int[result.size()];
        for(int i=0;i<result.size();i++){
            array[i] =  result.get(i);
        }
        return array;
    }

    public static void main(String[] args) {
        S3115 s = new S3115();
        int[] nums = {4,2,9,5,3};
        System.out.println(s.maximumPrimeDifference(nums));
        int[] nums1 = {2,2};
        System.out.println(s.maximumPrimeDifference(nums1));
        int[] nums2 = {1,7};
        System.out.println(s.maximumPrimeDifference(nums2));
    }

}
