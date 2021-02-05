package top.alexmmd.javabasic.book;

/**
 * @author 汪永晖
 * @Date 2021/2/3 9:28
 */
public class Stopwatch {

    private final long start;

    /**
     * Create a stopwatch object.
     */
    public Stopwatch() {
        start = System.currentTimeMillis();
    }


    /**
     * Return elapsed time (in seconds) since this object was created.
     */
    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

}
