package com.kelvin;

import java.util.HashSet;
import java.util.Set;

public class S141_3 {
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
        ListNode fast = head.next;
        ListNode slow = head;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        ListNode n2 = new ListNode(2);
        test.next = n2;
        test.next.next = null;
//        test.next.next = new ListNode(0);
//        test.next.next.next = new ListNode(-4);
//        test.next.next.next.next = n2;
        S141_3 s141_3 = new S141_3();
        //System.out.println(s141_3.hasCycle(test));
        System.out.println(s141_3.hasCycle2(test));
    }
}
