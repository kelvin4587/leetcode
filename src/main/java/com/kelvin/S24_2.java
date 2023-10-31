package com.kelvin;

public class S24_2 {
    public ListNode swapPairs(ListNode head) {
        ListNode current = head;
        while (current.next != null) {
            ListNode cur = current;
            ListNode next = current.next;
            cur.next = next.next;
            next.next = cur;
            ListNode temp = cur;
            cur = next;
            next = temp;
        }
        return head;
    }

    public ListNode swapPairsRecurse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapPairsRecurse(newHead.next);
        newHead.next = head;
        return newHead;
    }

    public ListNode swapPairsLoop(ListNode head) {
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
        ListNode init = init();
        S24_2 s = new S24_2();
        init = s.swapPairsRecurse(init);
        System.out.println(init);
        System.out.println(s.swapPairsLoop(init));
    }

    public static ListNode init() {
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int val = 2; val <= 4; val++) {
            ListNode next = new ListNode(val);
            current.next = next;
            current = current.next;
        }
        System.out.println(head);
        return head;
    }

}
