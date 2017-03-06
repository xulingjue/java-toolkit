package io.github.xulingjue.designpatterns.abstractfactory;

/**
 * AbstractFactory
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/6 16:17
 * @Version V1.0
 */
public interface AbstractFactory {
    Gun getGun();
    Bullet getBullet();
}
