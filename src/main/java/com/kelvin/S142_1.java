package com.kelvin;

import java.util.HashSet;
import java.util.Set;

public class S142_1 {
    public ListNodeCycle detectCycle(ListNodeCycle head) {
        ListNodeCycle pos = head;
        Set<ListNodeCycle> visited = new HashSet<ListNodeCycle>();
        while (pos != null) {
            if (visited.contains(pos)) {
                return pos;
            } else {
                visited.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }
    public ListNodeCycle detectCycle2(ListNodeCycle head) {
        if(head==null){
            return null;
        }
        ListNodeCycle slow = head,fast=head;
        while (fast != null) {
            slow = slow.next;
            if(fast.next!=null){
                fast=fast.next.next;
            }else{
                return null;
            }
            if(fast==slow){
                ListNodeCycle ptr = head;
                while(ptr!=slow){
                    ptr=ptr.next;
                    slow=slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        ListNodeCycle test=new ListNodeCycle(3);
        ListNodeCycle n2=new ListNodeCycle(2);
        test.next = n2;
        test.next.next = new ListNodeCycle(0);
        test.next.next.next = new ListNodeCycle(-4);
        test.next.next.next.next = n2;
        S142_1 s142_1 = new S142_1();
        ListNodeCycle node = s142_1.detectCycle2(test);
        System.out.println(node);

    }
}
