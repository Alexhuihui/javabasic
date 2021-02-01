package top.alexmmd.javabasic.book;

/**
 * @author 汪永晖
 * @Date 2021/1/27 8:52
 */
public class SeparateChainingHashST<Key, Value> {

    private int N;

    /**
     * 链表数组的长度
     */
    private int M;

    private SequentialSearchST<Key, Value>[] st;

    public SeparateChainingHashST() {
        this(997);
    }

    public SeparateChainingHashST(int M) {
        this.M = M;
        st = (SequentialSearchST<Key, Value>[]) new SequentialSearchST[M];
        for (int i = 0; i < M; i++) {
            st[i] = new SequentialSearchST();
        }
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public Value get(Key key) {
        int hash = this.hash(key);
        return (Value) st[hash].get(key);
    }

    public void put(Key key, Value value) {
        int hash = this.hash(key);
        st[hash].put(key, value);
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    // return all keys as an Iterable
    public Iterable<Key> keys() {
        Queue<Key> queue = new Queue<Key>();
        for (int i = 0; i < M; i++) {
            SequentialSearchST sequentialSearchST = st[i];
            for (SequentialSearchST.Node x = sequentialSearchST.getFirst(); x != null; x = x.getNext())
                queue.enqueue((Key) x.getKey());
        }

        return queue;
    }
}
