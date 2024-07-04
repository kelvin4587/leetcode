package com.kelvin;

public class S3099 {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        String s = String.valueOf(x);
        int sum = 0;
        for(int i = 0; i <s.length(); i++){
            int number = Integer.parseInt(s.substring(i, i + 1));
            sum += number;
        }
        if(x%sum == 0){
            return sum;
        }else{
            return -1;
        }

    }

    public static void main(String[] args) {
        S3099 s = new S3099();
        System.out.println(s.sumOfTheDigitsOfHarshadNumber(18));
        System.out.println(s.sumOfTheDigitsOfHarshadNumber(23));
    }
}
