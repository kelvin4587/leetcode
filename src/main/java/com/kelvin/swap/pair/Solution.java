package com.kelvin.swap.pair;

import org.junit.Test;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if ((head == null) || (head.next == null)) {
            return head;
        }
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }

    @Test
    public void testSwapPairs() {
        ListNode rs = null;
        ListNode head = null;
        for (int i = 1; i <= 4; i++) {
            ListNode next = null;
            if (i == 1) {
                head = new ListNode(i);
                rs = head;
            } else {
                next = new ListNode(i);
                head.next = next;
                head = next;
            }
        }
        System.out.println(rs);
        this.swapPairs(rs);
        System.out.println(rs);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.val);
        ListNode next = this.next;
        while (this.next != null) {
            sb.append("->");
            sb.append(this.next.val);
            this.next = this.next.next;
        }
        this.next = next;
        return sb.toString();
    }
}