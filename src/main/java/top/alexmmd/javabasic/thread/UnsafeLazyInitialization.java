package top.alexmmd.javabasic.thread;

import org.apache.logging.log4j.CloseableThreadContext;
import top.alexmmd.javabasic.reflect.Robot;

/**
 * 第1种 不加锁（裸奔写法）
 *
 * @author 汪永晖
 * @Date 2020/11/18 10:46
 */
public class UnsafeLazyInitialization {
    private static Robot instance;

    public static Robot getInstance() {
        if (instance == null) {
            synchronized (UnsafeLazyInitialization.class) {
                if (instance == null) //1
                    instance = new Robot(); //2
            }
        }
        return instance;
    }
}

