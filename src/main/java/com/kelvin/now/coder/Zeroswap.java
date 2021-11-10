package com.kelvin.now.coder;

/**
 * @author kelvin
 * @date 2021/5/26 4:09 PM
 */
public class Zeroswap {
    public static void main(String[] args) {
        int[] testData = {0, 4, 5, 2, 1, 3, 6};
    }

    public static void zeroswap(int[] array, int len, int n) {
        int zeroIndex = -1;
        int nIndex = -1;
        for (int i = 0; i < len; i++) {
            if (array[i] == 0) {
                zeroIndex = i;
            }
            if (array[i] == n) {
                nIndex = i;
            }
            if (zeroIndex != -1 && nIndex != -1) {
                swap(array,zeroIndex,nIndex);
                break;
            }
        }

    }



    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
