package io.github.xulingjue.javatoolkit.designpatterns.abstractfactory.deserteagle;

import io.github.xulingjue.javatoolkit.designpatterns.abstractfactory.Bullet;

/**
 * DesertEagleBullet
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/6 16:46
 * @Version V1.0
 */
public class DesertEagleBullet implements Bullet {
    public void flying() {
        System.out.println("DesertEagle Bullet flying……");
    }
}
