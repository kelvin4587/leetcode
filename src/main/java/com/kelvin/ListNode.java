package com.kelvin;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {

    }

    public ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.val);
        ListNode temp = this.next;
        while (temp != null) {
            sb.append("->");
            sb.append(temp.val);
            temp = temp.next;
        }
        return sb.toString();
    }
}
