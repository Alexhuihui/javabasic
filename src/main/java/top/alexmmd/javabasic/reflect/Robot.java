package top.alexmmd.javabasic.reflect;

/**
 * @author 汪永晖
 * @Date 2020/11/5 18:29
 */
public class Robot {

    private String name;

    public void sayHi(String helloSentence) {
        System.out.println(helloSentence + " " + name);
    }

    private String throwHello(String tag) {
        return "hello " + tag;
    }
}
