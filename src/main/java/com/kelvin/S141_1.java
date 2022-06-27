package com.kelvin;

import java.util.HashSet;
import java.util.Set;

public class S141_1 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while(head!=null){
            if(!seen.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;

    }

    public boolean hasCycle2(ListNode head) {
        if(head ==null || head.next ==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow !=fast){
            if(fast ==null|| fast.next==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode test=new ListNode(3);
        ListNode n2=new ListNode(2);
        test.next = n2;
        test.next.next = new ListNode(0);
        test.next.next.next = new ListNode(-4);
        test.next.next.next.next = n2;
        S141_1 s141_1 = new S141_1();
        System.out.println(s141_1.hasCycle(test));
    }
}
