package io.github.xulingjue.javatoolkit.designpatterns.singleton;

/**
 * Singleton
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/6 18:00
 * @Version V1.0
 *
 * 恶汉式，当初始化类需要消耗大量资源时不适用
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
