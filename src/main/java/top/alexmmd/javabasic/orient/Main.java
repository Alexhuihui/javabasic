package top.alexmmd.javabasic.orient;

/**
 * @author 汪永晖
 * @Date 2020/12/10 19:04
 */
public class Main {

    public static void main(String[] args) {
        Fly air = new Airplane("air");
        Fly hel = new Helicopter("hel");

        accept(air);
        accept(hel);
    }

    public static void accept(Fly fly) {
        fly.fly("shanghai", "beijing");
    }
}
