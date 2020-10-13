package com.kelvin.has.cycle2;

import com.kelvin.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testDetectCycle() {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode node_4 = new ListNode(-4);
        node3.next = node2;
        node2.next = node0;
        node0.next = node_4;
        node_4.next = node2;
        Solution s = new Solution();
        Assert.assertEquals(s.detectCycle(node3), 1);
    }
}
