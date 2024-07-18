package com.kelvin;

import java.util.Arrays;

public class S2956 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int num1Sum = 0;
        int num2Sum = 0;
        int[] result = new int[2];
        for(int num1 : nums1) {
            int preNum1Same = 0;
            for (int num2 : nums2) {
                if (num1 == num2 && preNum1Same != num2) {
                    num1Sum++;
                    preNum1Same = num2;
                } else  {
                    continue;
                }
            }
        }
        for(int num2 : nums2) {
            int preNum2Same = 0;
            for (int num1 : nums1) {
                if (num1 == num2 && preNum2Same != num1) {
                    num2Sum++;
                    preNum2Same = num1;
                } else  {
                    continue;
                }
            }
        }
        result[0] = num1Sum;
        result[1] = num2Sum;
        return result;
    }
    public static void main(String[] args) {
        S2956 s2956 = new S2956();
        int[] result = s2956.findIntersectionValues(new int[]{2,3,2},new int[]{1,2});
        System.out.println(Arrays.toString(result));
        int[] result1 = s2956.findIntersectionValues(new int[]{4,3,2,3,1},new int[]{2,2,5,2,3,6});
        System.out.println(Arrays.toString(result1));
        int[] result2 = s2956.findIntersectionValues(new int[]{3,4,2,3},new int[]{1,5});
        System.out.println(Arrays.toString(result2));
    }
}
