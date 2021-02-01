package top.alexmmd.javabasic.book;

public class FixedCapacityStack<T> {

    private T[] array;

    private int n;

    public FixedCapacityStack(int cap) {
        array = (T[]) new Object[cap];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public Integer size() {
        return n;
    }

    public void push(T item) {
        array[n++] = item;
    }

    public T pop() {
        return array[--n];
    }
}
