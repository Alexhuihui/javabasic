package top.alexmmd.javabasic.book;

import java.util.Iterator;

/**
 * @author 汪永晖
 * @Date 2021/1/15 15:10
 */
public class ResizingArrayStack<T> implements Iterable<T> {

    private T[] array = (T[]) new Object[1];
    private int n;

    public boolean isEmpty() {
        return n == 0;
    }

    public Integer size() {
        return n;
    }

    public void resize(int max) {
        if (array.length < max) {
            System.out.print("我扩容了");
        } else {
            System.out.print("我缩减了");
        }

        T[] copy = (T[]) new Object[max];
        for (int i = 0; i < n; i++) {
            copy[i] = array[i];
        }
        array = copy;
    }

    public void push(T item) {
        if (n == array.length) {
            resize(2 * array.length);
        }
        array[n++] = item;
    }

    public T pop() {
        T item = array[--n];
        array[n] = null;
        if (n > 0 && n == array.length / 4) {
            resize(array.length / 2);
        }
        return item;
    }


    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<T> { // Support LIFO iteration.
        private int i = n;

        public boolean hasNext() {
            return i > 0;
        }

        public T next() {
            return array[--i];
        }

        public void remove() {

        }


    }
}
