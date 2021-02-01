package top.alexmmd.javabasic.book;

/**
 * @author 汪永晖
 * @Date 2021/1/20 15:33
 */
public class LinkedListQueue<T> {

    private Node first; // link to least recently added node
    private Node last; // link to most recently added node
    private int n;

    // number of items on the queue
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

    public void enqueue(T item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;

        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }

        n++;
    }

    public T dequeue() {
        T item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        n--;
        return item;
    }
}
