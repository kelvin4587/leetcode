package com.kelvin;

import java.util.Arrays;

public class S21_1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 == null) {
            return list1;
        }
        if (list2 != null && list1 == null) {
            return list2;
        }
        if (list2 == null && list1 == null) {
            return null;
        }
        ListNode current = list1;
        ListNode prev = list2;
        while (current != null && prev != null) {
            if (current.val < prev.val) {
                ListNode temp = prev;
                prev = current.next;
                current.next = temp;
            } else {
                ListNode temp = current;
                current = prev;
                prev = temp;
                break;
            }
            current = current.next;
        }
        return list1;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }
    }

    public ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(2);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
        ListNode head2 = new ListNode(1);
//        head2.next = new ListNode(5);
//        head2.next.next = new ListNode(6);
        S21_1 s21_1 = new S21_1();
        System.out.println(s21_1.mergeTwoLists(head, head2));
    }
}



