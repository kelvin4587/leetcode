package com.kelvin;

public class S3096 {
    public int minimumLevels(int[] possible) {
        int n = possible.length;
        int tot = 0;
        for (int x : possible) {
            tot += x == 1 ? 1 : -1;
        }
        int pre = 0;
        for (int i = 0; i < n - 1; i++) {
            pre += possible[i] == 1 ? 1 : -1;
            if (2 * pre > tot) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        S3096 s3096 = new S3096();
        System.out.println(s3096.minimumLevels(new int[]{1, 0, 1, 0}));
    }
}
