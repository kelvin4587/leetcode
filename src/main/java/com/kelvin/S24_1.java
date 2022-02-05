package com.kelvin;

public class S24_1 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }

    public ListNode swapPairs2(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null && temp.next.next != null) {
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            temp = node1;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= 5; i++) {
            ListNode next = new ListNode(i);
            current.next = next;
            current = next;
        }
        System.out.println(head);
        S24_1 s24_1 = new S24_1();
        ListNode test1 = s24_1.swapPairs(head);
        System.out.println(test1);
        ListNode test2 = s24_1.swapPairs2(test1);
        System.out.println(test2);
    }
}



