package com.kelvin;

public class Solution21_1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l2.val>l1.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(4);
        l1.next=l2;
        l2.next=l3;
        ListNode l21=new ListNode(1);
        ListNode l22=new ListNode(3);
        ListNode l23=new ListNode(4);
        l21.next=l22;
        l22.next=l23;
        Solution21_1 solution21_1 = new Solution21_1();
        ListNode listNode = solution21_1.mergeTwoLists(l1, l21);
        System.out.println(listNode);
    }
}
