package com.kelvin;

public class S206_2 {
    public ListNode reverseList1(ListNode head) {
        return null;
    }

    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode current =head;
        while(current.next!=null){

        }
        return null;
    }

    public static void main(String[] args) {
        ListNode rs = null;
        ListNode head = null;
        for (int i = 1; i <= 5; i++) {
            ListNode next = null;
            if (i == 1) {
                head = new ListNode(i);
                rs = head;
            } else {
                next = new ListNode(i);
                head.next = next;
                head = next;
            }
        }
        System.out.println(rs);
        S206_2 s = new S206_2();
        ListNode listNode = s.reverseList1(rs);
        System.out.println(listNode);
        System.out.println(s.reverseList2(listNode));
    }
}
