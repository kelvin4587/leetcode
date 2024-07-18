package com.kelvin;

public class S369 {
    public ListNode plusOne(ListNode head) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode notNine = sentinel;
        while(head != null) {
            if(head.val != 9) {
                notNine = head;
            }
            head = head.next;
        }
        notNine.val++;
        notNine = notNine.next;
        while(notNine != null) {
            notNine.val = 0;
            notNine = notNine.next;
        }
        return sentinel.val != 0 ? sentinel: sentinel.next;
    }
    public static void main(String[] args) {
        S369 s369 = new S369();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode listNode = s369.plusOne(head);
        while(listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
}
