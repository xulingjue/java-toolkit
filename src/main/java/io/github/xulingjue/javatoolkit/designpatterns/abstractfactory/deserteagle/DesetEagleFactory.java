package io.github.xulingjue.javatoolkit.designpatterns.abstractfactory.deserteagle;

import io.github.xulingjue.javatoolkit.designpatterns.abstractfactory.AbstractFactory;
import io.github.xulingjue.javatoolkit.designpatterns.abstractfactory.Bullet;
import io.github.xulingjue.javatoolkit.designpatterns.abstractfactory.Gun;

/**
 * DesetEagleFactory
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/6 16:46
 * @Version V1.0
 */
public class DesetEagleFactory implements AbstractFactory {

    public Gun getGun() {
        return new DesertEagle();
    }

    public Bullet getBullet() {
        return new DesertEagleBullet();
    }
}
