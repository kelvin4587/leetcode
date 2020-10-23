package com.kelvin.one.eight.nine;

import org.junit.Assert;
import org.junit.Test;

public class ReverseSolutionTest {
    @Test
    public void testReverse() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        ReverseSolution reverseSolution = new ReverseSolution();
        reverseSolution.rotate(nums, 3);
        Assert.assertArrayEquals(nums, new int[]{5, 6, 7, 1, 2, 3, 4});
    }
}
