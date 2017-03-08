package io.github.xulingjue.javatoolkit.designpatterns.abstractfactory;

/**
 * Gun
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/6 16:18
 * @Version V1.0
 */
public interface Gun {
    void loadeBullets(Bullet bullet);
    void fire();
}
