package top.alexmmd.javabasic.book;

/**
 * @author 汪永晖
 * @Date 2021/2/2 16:39
 */
public class Insertion extends SortExample {

    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
}
