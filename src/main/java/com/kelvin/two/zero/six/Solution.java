package com.kelvin.two.zero.six;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head.next != null) {
            reverseList(head.next);
        }
        return head.next;
    }

    public ListNode getNext(ListNode node) {
        if (node.next != null) {
            getNext(node.next);
        }
        return node.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        for (int i = 2; i <= 5; i++) {
            ListNode next = new ListNode(i);
            head.next = next;
        }
    }
}
