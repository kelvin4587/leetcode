package com.kelvin;

import java.util.HashSet;
import java.util.Set;

public class S142_1 {
    public ListNode detectCycle(ListNode head) {
        ListNode pos = head;
        Set<ListNode> visited = new HashSet<ListNode>();
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

    public static void main(String[] args) {

    }
}
