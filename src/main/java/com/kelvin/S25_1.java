package com.kelvin;

public class S25_1 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode hair = new ListNode(0);
        hair.next = head;
        ListNode pre = hair;
        while(head!=null){
            ListNode tail = pre;
            for(int i=0;i<k;i++){
                tail = tail.next;
                if(tail==null){
                    return hair.next;
                }
            }
            ListNode next = tail.next;
            ListNode[] reverse = myReverse(head,tail);
            head = reverse[0];
            tail = reverse[1];
            pre.next = head;
            tail.next = next;
            pre = tail;
            head = tail.next;
        }
        return hair.next;
    }
    public ListNode[] myReverse(ListNode head,ListNode tail){
        ListNode prev = tail.next;
        ListNode p = head;
        while(prev!=tail){
            ListNode next = p.next;
            p.next = prev;
            prev = p;
            p = next;
        }
        return new ListNode[]{tail,head};
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode current = head;
        for(int i=2;i<=5;i++){
            current.next = new ListNode(i);
            current = current.next;
        }
        System.out.println(head);
        S25_1 s25_1 = new S25_1();
        System.out.println(s25_1.reverseKGroup(head,2));
    }
}
