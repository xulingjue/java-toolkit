package io.github.xulingjue.javatoolkit.designpatterns.singleton;

/**
 * Singleton2
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/6 18:01
 * @Version V1.0
 *
 * 登记式,多线程安全,延迟加载
 */
public class Singleton2 {
    private static class SingletonHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    private Singleton2() {
        System.out.println("new singleton2");
    }

    public static final Singleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
