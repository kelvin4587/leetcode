package com.kelvin;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class S3102 {
    public int minimumDistance(int[][] points) {
        TreeMap<Integer, Integer> sx = new TreeMap<>();
        TreeMap<Integer, Integer> sy = new TreeMap<>();
        for (int[] point : points) {
            sx.put(point[0] - point[1], sx.getOrDefault(point[0] - point[1], 0) + 1);
            sy.put(point[0] + point[1], sy.getOrDefault(point[0] + point[1], 0) + 1);
        }
        int res = Integer.MAX_VALUE;
        for (int[] point : points) {
            sx.put(point[0] - point[1], sx.get(point[0] - point[1]) - 1);
            if (sx.get(point[0] - point[1]) == 0) {
                sx.remove(point[0] - point[1]);
            }
            sy.put(point[0] + point[1], sy.get(point[0] + point[1]) - 1);
            if (sy.get(point[0] + point[1]) == 0) {
                sy.remove(point[0] + point[1]);
            }
            res = Math.min(res, Math.max(sx.lastKey() - sx.firstKey(), sy.lastKey() - sy.firstKey()));
            sx.put(point[0] - point[1], sx.getOrDefault(point[0] - point[1], 0) + 1);
            sy.put(point[0] + point[1], sy.getOrDefault(point[0] + point[1], 0) + 1);
        }
        return res;
    }
    public int minimumDistance4(int[][] points) {
        TreeMap<Integer, Integer> sx = new TreeMap<Integer, Integer>();
        TreeMap<Integer, Integer> sy = new TreeMap<Integer, Integer>();
        for (int[] p : points) {
            sx.put(p[0] - p[1], sx.getOrDefault(p[0] - p[1], 0) + 1);
            sy.put(p[0] + p[1], sy.getOrDefault(p[0] + p[1], 0) + 1);
        }
        int res = Integer.MAX_VALUE;
        for (int[] p : points) {
            sx.put(p[0] - p[1], sx.get(p[0] - p[1]) - 1);
            if (sx.get(p[0] - p[1]) == 0) {
                sx.remove(p[0] - p[1]);
            }
            sy.put(p[0] + p[1], sy.get(p[0] + p[1]) - 1);
            if (sy.get(p[0] + p[1]) == 0) {
                sy.remove(p[0] + p[1]);
            }
            res = Math.min(res, Math.max(sx.lastKey() - sx.firstKey(), sy.lastKey() - sy.firstKey()));
            sx.put(p[0] - p[1], sx.getOrDefault(p[0] - p[1], 0) + 1);
            sy.put(p[0] + p[1], sy.getOrDefault(p[0] + p[1], 0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] points = new int[][]{{3, 10}, {5, 15}, {10, 2}, {4, 4}};
        System.out.println(new S3102().minimumDistance(points));
        int[][] points2 = new int[][]{{1, 1}, {1, 1}, {1, 1}};
        System.out.println(new S3102().minimumDistance(points2));
        System.out.println(new S3102().minimumDistance3(points));
    }

    public int minimumDistance2(int[][] points) {
        int n = points.length;
        List<int[]> sx = new ArrayList<>();
        List<int[]> sy = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = points[i][0], y = points[i][1];
            sx.add(new int[]{x - y, i});
            sx.add(new int[]{x + y, i});
        }
        sx.sort((a, b) -> a[0] - b[0]);
        sy.sort((a, b) -> a[0] - b[0]);
        int maxVal1 = sx.get(sx.size() - 1)[0] - sx.get(0)[0];
        int maxVal2 = sx.get(sx.size() - 1)[0] - sx.get(0)[0];
        int res = Integer.MAX_VALUE;
        if (maxVal1 >= maxVal2) {
            int i = sx.get(0)[1],j = sx.get(sx.size() - 1)[1];
            res = Math.min(res, Math.max(remove(sx,i), remove(sy,i)));
            res = Math.min(res, Math.max(remove(sx,j), remove(sy,j)));
        }else{
            int i = sy.get(0)[1],j = sy.get(sy.size() - 1)[1];
            res = Math.min(res, Math.max(remove(sx,i), remove(sy,i)));
            res = Math.min(res, Math.max(remove(sx,j), remove(sy,j)));
        }
        return res;
    }

    public int minimumDistance3(int[][] points) {
        int n = points.length;
        List<int[]> sx = new ArrayList<int[]>();
        List<int[]> sy = new ArrayList<int[]>();
        for (int i = 0; i < n; i++) {
            int x = points[i][0], y = points[i][1];
            sx.add(new int[]{x - y, i});
            sy.add(new int[]{x + y, i});
        }
        sx.sort((a, b) -> a[0] - b[0]);
        sy.sort((a, b) -> a[0] - b[0]);
        int maxVal1 = sx.get(sx.size() - 1)[0] - sx.get(0)[0];
        int maxVal2 = sy.get(sy.size() - 1)[0] - sy.get(0)[0];
        int res = Integer.MAX_VALUE;
        if (maxVal1 >= maxVal2) {
            int i = sx.get(0)[1], j = sx.get(sx.size() - 1)[1];
            // 去掉 i 后的最大曼哈顿距离
            res = Math.min(res, Math.max(remove(sx, i), remove(sy, i)));
            // 去掉 j 后的最大曼哈顿距离
            res = Math.min(res, Math.max(remove(sx, j), remove(sy, j)));
        } else {
            int i = sy.get(0)[1], j = sy.get(sy.size() - 1)[1];
            // 去掉 i 后的最大曼哈顿距离
            res = Math.min(res, Math.max(remove(sx, i), remove(sy, i)));
            // 去掉 j 后的最大曼哈顿距离
            res = Math.min(res, Math.max(remove(sx, j), remove(sy, j)));
        }
        return res;
    }


    public int remove(List<int[]> arr, int i) {
        int n = arr.size();
        if (arr.get(0)[1] == i) {
            return arr.get(n - 1)[0] - arr.get(1)[0];
        } else if (arr.get(n - 1)[1] == i) {
            return arr.get(n - 2)[0] - arr.get(0)[0];
        } else {
            return arr.get(n - 1)[0] - arr.get(0)[0];
        }
    }
}
