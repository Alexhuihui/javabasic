package top.alexmmd.javabasic.observer;

/**
 * @author 汪永晖
 * @Date 2020/11/20 11:27
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
