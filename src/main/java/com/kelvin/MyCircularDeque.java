package com.kelvin;

public class MyCircularDeque {
    private int head, tail, size, n;
    private final int[] a;

    public MyCircularDeque(int k) {
        a = new int[k];
        n = a.length;
        tail = 1;
    }

    public boolean insertFront(int value) {
        if (size == n) return false;
        a[head = ++head % n] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (size == n) return false;
        //为了避免0情况
        a[tail = (--tail + n) % n] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (size == 0) return false;
        head = (--head + n) % n;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (size == 0) return false;
        tail = ++tail % n;
        size--;
        return true;
    }

    public int getFront() {
        return size == 0 ? -1 : a[head];
    }

    public int getRear() {
        return size == 0 ? -1 : a[tail];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == n;
    }

    public static void main(String[] args) {
        MyCircularDeque myCircularDeque = new MyCircularDeque(3);
        System.out.println(myCircularDeque.insertLast(1));
        System.out.println(myCircularDeque.insertLast(2));
        System.out.println(myCircularDeque.insertFront(3));
        System.out.println(myCircularDeque.insertFront(4));
        System.out.println(myCircularDeque.getRear());
        System.out.println(myCircularDeque.isFull());
        System.out.println(myCircularDeque.deleteLast());
    }
}
