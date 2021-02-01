package top.alexmmd.javabasic.orient;

/**
 * @author 汪永晖
 * @Date 2020/12/10 19:04
 */
public class Helicopter implements Fly {

    private String name;

    public Helicopter(String name) {
        this.name = name;
    }

    @Override
    public void fly(String source, String target) {
        System.out.println(name + "-----" + source + "-----" + target);
    }
}
