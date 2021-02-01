package top.alexmmd.javabasic.book;

/**
 * This generic Stack implementation is based on a linked-list data structure
 *
 * @author 汪永晖
 * @Date 2021/1/20 14:35
 */
public class LinkedListStack<T> {

    private Node first; // top of stack (most recently added node)
    private int n;

    // number of items
    private class Node { // nested class to define nodes
        T item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void push(T item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        n++;
    }

    public T pop() {
        T item = first.item;
        first = first.next;
        n--;
        return item;
    }

}
