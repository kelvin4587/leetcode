package com.kelvin;

import java.util.HashSet;
import java.util.Set;

public class S141_2 {
    public boolean hasCycle(ListNode head) {

    }

    public boolean hasCycle2(ListNode head) {

    }

    public static void main(String[] args) {
        ListNode test = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        test.next = n2;
        test.next.next = new ListNode(0);
        test.next.next.next = new ListNode(-4);
        test.next.next.next.next = n3;
        S141_2 s141_2 = new S141_2();
        System.out.println(s141_2.hasCycle2(test));
    }
}
