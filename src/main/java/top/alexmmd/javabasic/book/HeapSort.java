package top.alexmmd.javabasic.book;

/**
 * @author 汪永晖
 * @Date 2021/2/4 16:00
 */
public class HeapSort extends SortExample {

    public static void sort(Comparable[] pq) {
        int N = pq.length;
        for (int k = N / 2; k >= 1; k--)
            sink(pq, k, N);
        while (N > 1) {
            exch(pq, 1, N--);
            sink(pq, 1, N);
        }
    }

    /***********************************************************************
     * Helper functions to restore the heap invariant.
     **********************************************************************/

    private static void sink(Comparable[] pq, int k, int N) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(pq[j], pq[j + 1])) j++;
            if (!less(pq[k], pq[j])) break;
            exch(pq, k, j);
            k = j;
        }
    }
}
