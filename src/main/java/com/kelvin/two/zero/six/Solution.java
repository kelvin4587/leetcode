package com.kelvin.two.zero.six;

public class Solution {
    public ListNode reverseListIteria(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        if (cur != null) {
            ListNode tempNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tempNext;
        }
        return pre;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p=reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        for (int i = 2; i <= 5; i++) {
            ListNode next = new ListNode(i);
            head.next = next;
        }
    }
}
