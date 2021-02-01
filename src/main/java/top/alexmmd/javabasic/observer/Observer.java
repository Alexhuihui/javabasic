package top.alexmmd.javabasic.observer;

/**
 * @author 汪永晖
 * @Date 2020/11/20 11:24
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
