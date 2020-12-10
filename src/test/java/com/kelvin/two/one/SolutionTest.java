package com.kelvin.two.one;

import com.kelvin.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testmergeTwoLists() {
        Solution s=new Solution();
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);
        ListNode l2=new ListNode(1);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(4);
        System.out.println(l1);
        System.out.println(l1);
        System.out.println(l2);
        ListNode merged = s.mergeTwoLists(l1, l2);
        Assert.assertEquals("1->1->2->3->4->4",merged);
    }

}
