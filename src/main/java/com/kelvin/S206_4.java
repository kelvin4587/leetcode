package com.kelvin;

public class S206_4 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return current;
    }

    public ListNode reverseListLoop(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = null;
        ListNode current = null;
        for (int i = 1; i <= 5; i++) {
            ListNode listNode = new ListNode(i);
            if (i == 1) {
                current = listNode;
                head = current;
            } else {
                current.next = listNode;
                current = listNode;
            }
        }
        System.out.println(head);
        S206_4 s206_4 = new S206_4();
        ListNode converted = s206_4.reverseList(head);
        System.out.println(converted);
        System.out.println(s206_4.reverseListLoop(converted));
    }
}
