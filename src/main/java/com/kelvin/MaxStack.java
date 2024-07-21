package com.kelvin;

import java.util.Comparator;
import java.util.TreeSet;

public class MaxStack {
    private TreeSet<int[]> stack;
    private TreeSet<int[]> values;
    private int cnt;
    public MaxStack() {
        Comparator<int[]> comp = (a,b) ->{
            return a[0]==b[0]?a[1]-b[1]:a[0]-b[0];
        };
        stack = new TreeSet<>(comp);
        values = new TreeSet<>(comp);
        cnt = 0;
    }
    public void push(int x) {
        stack.add(new int[]{cnt,x});
        values.add(new int[]{x,cnt});
        cnt++;
    }

    public int pop() {
        int[] pair = stack.pollFirst();
        values.remove(new int[]{pair[1],pair[0]});
        return pair[1];
    }
    public int top() {
        return stack.last()[1];
    }
    public int peeKMax(){
        return values.last()[0];
    }
    public int popMax(){
        int[] pair = values.pollFirst();
        stack.remove(new int[]{pair[1],pair[0]});
        return pair[0];
    }
}
