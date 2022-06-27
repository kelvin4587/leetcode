package com.kelvin;

public class S206_2 {
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = reverseList1(head.next);
        head.next.next =head;
        head.next = null;
        return result;
    }

    public ListNode reverseList2(ListNode head) {
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
            if (i == 1) {
                head = new ListNode(i);
                current = head;
            } else {
                ListNode next = new ListNode(i);
                current.next = next;
                current = next;
            }
        }
        System.out.println(head);
        S206_2 s = new S206_2();
        ListNode listNode = s.reverseList2(head);
        System.out.println(listNode);
        System.out.println(s.reverseList1(listNode));
    }
}
