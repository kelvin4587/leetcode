package com.kelvin;

public class S206_5 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        //保持前一个节点
        ListNode pre = null;
        while (cur != null) {
            //保存下一个节点，因为后面这个下个节点就要被修改存下不被覆盖
            ListNode next = cur.next;
            //赋值前一个节点
            cur.next = pre;
            //存储当前节点为前一个节点
            pre = cur;
            //当前节点下移一个用来结束循环
            cur = next;
        }
        return pre;
    }

    public ListNode reverseListLoop(ListNode head) {
        //基本的验证
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseListLoop(head.next);
        //反转等于他下面的指回自己
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = null;
        ListNode current = null;
        for (int i = 1; i <= 5; i++) {
            ListNode listNode = new ListNode(i);
            if (i == 1) {
                current = listNode;
                head = current;
            } else {
                current.next = listNode;
                current = listNode;
            }
        }
        System.out.println(head);
        S206_5 s206_4 = new S206_5();
        ListNode converted = s206_4.reverseList(head);
        System.out.println(converted);
        System.out.println(s206_4.reverseListLoop(converted));
    }
}
