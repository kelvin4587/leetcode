package com.kelvin.two.one;

import com.kelvin.ListNode;


public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merged = null;
        while (l1.next != null && l2.next != null) {
            if (l1.val < l2.val) {
                merged = new ListNode(l1.val);
                merged.next = l1.next;
                l1.next = l1.next.next;
            } else {
                merged = new ListNode(l2.val);
                merged.next = l2.next;
                l2.next = l2.next.next;
            }
        }
        if (l1.next != null && l2.next == null) {
            merged.next=l1.next;
        }
        if (l2.next != null && l1.next == null) {
            merged.next=l2.next;
        }
        return merged;
    }
}
