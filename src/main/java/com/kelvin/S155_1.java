package com.kelvin;

import java.util.Deque;
import java.util.LinkedList;

public class S155_1 {
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(6);
        ms.push(9);
        ms.push(-1);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
        System.out.println(ms.top());
    }
}
class MinStack{
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(),x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return  xStack.peek();
    }

    public int getMin() {
        return  minStack.peek();
    }
}

