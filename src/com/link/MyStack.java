package com.link;

import java.util.EmptyStackException;

public class MyStack<T> {
    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = top.data;

        top = top.next;
        return item;
    }

    public void push(T item) {
        StackNode<T> t = new StackNode<T>(item);
        t.next = top;
        top = t;
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args){

        MyStack stk = new MyStack();

        StackNode snode = new StackNode(5);
        stk.push(snode);

        StackNode snode1 = new StackNode(6);
        stk.push(snode);

        StackNode snode2 = new StackNode(7);
        stk.push(snode);

        System.out.println((stk.peek()));

    }
}
