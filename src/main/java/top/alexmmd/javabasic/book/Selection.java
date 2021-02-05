package top.alexmmd.javabasic.book;

/**
 * 选择排序
 *
 * @author 汪永晖
 * @Date 2021/2/2 15:23
 */
public class Selection extends SortExample {

    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }
}
