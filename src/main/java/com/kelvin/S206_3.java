package com.kelvin;

public class S206_3 {
    public ListNode reverseList1(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode current = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return current;
    }

    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode current =head;
        while(current!=null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
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
        S206_3 s = new S206_3();
        ListNode listNode = s.reverseList2(rs);
        System.out.println(listNode);
        System.out.println(s.reverseList1(listNode));
    }
}
