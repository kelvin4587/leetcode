package com.kelvin;

public class S84_1_1 {
    // iterates the widthes
    public int largestRectangleAreaIterateWidth(int[] heights) {
        int result = 0;
        for (int l = 0; l < heights.length; l++) {
            int minHeight = Integer.MAX_VALUE;
            for (int r = l; r < heights.length; r++) {
                minHeight = Math.min(minHeight, heights[r]);
                int width = r - l + 1;
                int area = minHeight * width;
                result = Math.max(result, area);
            }
        }
        return result;
    }

    // iterates the heights
    public int largestRectangleAreaIterateHeight(int[] heights) {
        int result = 0;
        for (int m = 0; m < heights.length; m++) {
            int l = m;
            int r = m;
            while (l -1 >= 0 && heights[l-1] >= heights[m]) {
                l--;
            }
            while (r+1 < heights.length && heights[r+1] >= heights[m]) {
                r++;
            }
            int minHeight = heights[m];
            int width = r-l+1;
            int area = minHeight*width;
            result = Math.max(area,result);
        }
        return result;
    }

    public static void main(String[] args) {
        S84_1_1 s = new S84_1_1();
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(s.largestRectangleAreaIterateWidth(heights));
        System.out.println(s.largestRectangleAreaIterateHeight(heights));
    }
}
