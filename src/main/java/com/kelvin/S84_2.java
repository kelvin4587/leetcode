package com.kelvin;

import java.util.Deque;
import java.util.LinkedList;

public class S84_2 {
    //iterates the widths
    public int largestRectangleArea1(int[] heights) {
        int result = Integer.MIN_VALUE;
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

    //iterates the heights
    public int largestRectangleArea2(int[] heights) {
        int result = Integer.MIN_VALUE;
        for (int m = 0; m < heights.length; m++) {
            int l = m;
            int r = m;
            while (l - 1 >= 0 && heights[l - 1] >= heights[m]) {
                l--;
            }
            while (r + 1 < heights.length && heights[r + 1] >= heights[m]) {
                r++;
            }
            int height = heights[m];
            int width = r - l + 1;
            int area = height * width;
            result = Integer.max(area, result);
        }
        return result;
    }

    //iterates the heights with stack
    public int largestRectangleArea3(int[] heights) {
        int result = Integer.MIN_VALUE;
        Deque<Integer> stack = new LinkedList();
        int right = 0;
        int left = 0;
        for (int m = 0; m < heights.length; m++) {
            int l = m;
            int r = m;
            while (l >= 0) {
                if (heights[l] >= heights[m]) {
                    stack.push(l);
                } else {
                    left = stack.pop();
                    break;
                }
                l--;
            }
            while (r < heights.length) {
                if (heights[r] >= heights[m]) {
                    stack.push(r);
                } else {
                    right = stack.pop();
                    break;
                }
                r++;
            }
            int height = heights[m];
            int width = right - left + 1;
            int area = height * width;
            result = Integer.max(area,result);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(new S84_2().largestRectangleArea1(heights));
        System.out.println(new S84_2().largestRectangleArea2(heights));
        System.out.println(new S84_2().largestRectangleArea3(heights));
    }
}
