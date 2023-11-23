package com.kelvin;

import java.util.HashSet;
import java.util.Set;

public class S141_2 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode cur = head;
        while (cur != null) {
            if (!set.add(cur)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head.next;
        while (slow != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        test.next = n2;
        test.next.next = new ListNode(0);
        test.next.next.next = new ListNode(-4);
        test.next.next.next.next = n2;
        S141_2 s141_2 = new S141_2();
        System.out.println(s141_2.hasCycle(test));
    }
}
