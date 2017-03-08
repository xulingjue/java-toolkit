package io.github.xulingjue.javatoolkit.designpatterns.abstractfactory.ak47;

import io.github.xulingjue.javatoolkit.designpatterns.abstractfactory.AbstractFactory;
import io.github.xulingjue.javatoolkit.designpatterns.abstractfactory.Bullet;
import io.github.xulingjue.javatoolkit.designpatterns.abstractfactory.Gun;

/**
 * AbstractAk47Factory
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/6 16:28
 * @Version V1.0
 */
public class Ak47Factory implements AbstractFactory {

    public Gun getGun() {
        return new Ak47();
    }

    public Bullet getBullet() {
        return new Ak47Bullet();
    }
}
