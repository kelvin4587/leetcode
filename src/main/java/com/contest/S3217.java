package com.contest;

import com.kelvin.ListNode;

import java.util.HashSet;
import java.util.Set;

public class S3217 {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        ListNode dummy = new ListNode(0,head);
        ListNode cur = dummy;
        while(cur.next != null){
            if(set.contains(cur.next.val)){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        S3217 s3217 = new S3217();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int[] nums = new int[]{1,2,3};
        ListNode listNode = s3217.modifiedList(nums, head);
        System.out.println(listNode);
    }
}
