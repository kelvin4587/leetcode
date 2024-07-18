package com.kelvin;

import java.util.ArrayList;
import java.util.List;

public class S1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int candy : candies){
            max=Math.max(max,candy);
        }
        List<Boolean> result = new ArrayList<>();
        for(int candy : candies){
            if((candy+extraCandies)>=max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        S1431 test = new S1431();
        System.out.println(test.kidsWithCandies(new int[]{2,3,5,1,3}, 3));
        System.out.println(test.kidsWithCandies(new int[]{4,2,1,1,2}, 1));
        System.out.println(test.kidsWithCandies(new int[]{12,1,12}, 10));
    }
}
