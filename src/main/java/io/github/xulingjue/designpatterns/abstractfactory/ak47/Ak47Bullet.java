package io.github.xulingjue.designpatterns.abstractfactory.ak47;

import io.github.xulingjue.designpatterns.abstractfactory.Bullet;

/**
 * Ak47Bullet
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/6 16:26
 * @Version V1.0
 */
public class Ak47Bullet implements Bullet {
    public void flying() {
        System.out.println("Ak47 Bullet flying……");
    }
}
