package com.kelvin.two.one;

import com.kelvin.ListNode;

import java.util.List;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l1Tail = null;
        ListNode l2Tail = null;
        ListNode merged = null;
        while (l1.next != null && l2.next != null) {
            if (l1.val < l2.val) {
                merged = new ListNode(l1.val);
                l1.next=l1.next.next;
            }else{
                merged = new ListNode(l2.val);
                l2.next=l2.next.next;
            }

        }
    }
}
