package com.kelvin;

public class S24_2 {
    public ListNode swapPairs(ListNode head) {
        return null;
    }

    public static void main(String[] args) {

    }
    public static void init(){
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int val = 2; val <= 4; val++) {
            ListNode next = new ListNode(val);
            current.next = next;
            current = current.next;
        }
        System.out.println(head);
    }

}
