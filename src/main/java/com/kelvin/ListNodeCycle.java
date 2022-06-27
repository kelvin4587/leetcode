package com.kelvin;

public class ListNodeCycle {
    public int val;
    public ListNodeCycle next;

    ListNodeCycle() {

    }

    public ListNodeCycle(int x) {
        val = x;
        next = null;
    }

    ListNodeCycle(int val, ListNodeCycle next) {
        this.val = val;
        this.next = next;
    }

}
