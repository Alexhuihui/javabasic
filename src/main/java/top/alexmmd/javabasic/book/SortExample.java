package top.alexmmd.javabasic.book;

/**
 * @author 汪永晖
 * @Date 2021/2/2 11:31
 */
public class SortExample {

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] a = StdIn.readStrings();
        Selection.sort(a);
        assert isSorted(a);
        show(a);
    }

    public static void sort(Comparable[] a) {

    }
}
