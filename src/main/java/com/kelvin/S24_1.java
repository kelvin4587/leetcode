package com.kelvin;

public class S24_1 {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode newHead=head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;

    }
    public ListNode swapPairs2(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next !=null && temp.next.next !=null){
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
        S24_1 s24_1 = new S24_1();
        ListNode test1=s24_1.swapPairs(rs);
        System.out.println(test1);
        System.out.println(s24_1.swapPairs2(test1));
    }
}

