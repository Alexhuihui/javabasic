package top.alexmmd.javabasic.reflect;

import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @author 汪永晖
 * @Date 2021/1/7 11:02
 */
public class ReflectTestApplication {

    public static void main(String[] args) throws IllegalAccessException {
        A a = new A("a", 1, new Date());
        B b = new B();
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        BeanCopyUtil.copyProperties(a, b);

        System.out.println("b = " + b);
        System.out.println("a = " + a);

    }
}
