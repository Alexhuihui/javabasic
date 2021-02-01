package top.alexmmd.javabasic.observer;

/**
 * @author 汪永晖
 * @Date 2020/11/20 11:27
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
