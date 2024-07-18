package com.contest;

public class S100352 {
    public String getSmallestString(String s) {
        char[] charArray = s.toCharArray();
        int preNum = -1;
        for (int i = 0; i < charArray.length; i++) {
            int num = charArray[i] - 48;
            if(preNum!=-1&&num%2==preNum%2&&preNum>num){
                char temp = charArray[i];
                charArray[i] = charArray[i-1];
                charArray[i-1] = temp;
            }
            preNum = num;
        }
        return new String(charArray);
    }

    public String getSmallestString2(String s) {
        char[] t = s.toCharArray();
        for(int i = 1; i < t.length; i++){
            char x = t[i-1];
            char y = t[i];
            if(x>y&&x%2==y%2){
                t[i-1]=y;
                t[i]=x;
                break;
            }
        }
        return new String(t);
    }

    public static void main(String[] args) {
        S100352 test = new S100352();
        System.out.println(test.getSmallestString2("45320"));
    }
}
