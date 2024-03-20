package com.kelvin;

public class S1969_1 {
    public int minNonZeroProduct(int p) {
        if (p == 1) {
            return 1;
        }
        long mod = 1000000007L;
        long x = fastPow(2, p, mod) - 1;
        long y = (long) 1 << (p - 1);
        return (int) (fastPow(x - 1, y - 1, mod) * x % mod);
    }

    public long fastPow(long x, long n, long mod) {
        long res = 1;
        while (n != 0) {
            if ((n & 1) != 0) {
                res = res * x % mod;
            }
            x = x * x % mod;
            n >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        S1969_1 s = new S1969_1();
        System.out.println(s.minNonZeroProduct(2));
    }
}
