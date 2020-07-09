package com.kelvin.swap.pair;

import org.junit.Test;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if ((head == null) || (head.next == null)) {
            return head;
        }
        /*
            1,
            head=1,2,3,4；n=2,3,4；调用(x=3,4)
            返回head=1,4,3,null;n=2,1,4,3,null
            2,
            n=4;head=3,4; 调用(x=null)；
            返回head=3,null;n=4,3,null
         */
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }

    public ListNode swapPairs1(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode current = head;
        ListNode newHead = head.next;
        while (current != null && current.next != null) {
            //1,2,3,4,5
            ListNode temp = current;
            //2,3,4,5
            current = current.next;
            //1,3,4,5
            temp.next = current.next;
            //2,1,3,4,5
            current.next = temp;
            //3,4,5
            current = temp.next;
            if (current != null && current.next != null) {
                temp.next = current.next;
            }
        }
        return newHead;
    }

    @Test
    public void testSwapPairs() {
        ListNode rs = null;
        ListNode head = null;
        for (int i = 1; i <= 5; i++) {
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
        System.out.println(this.swapPairs1(rs));
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