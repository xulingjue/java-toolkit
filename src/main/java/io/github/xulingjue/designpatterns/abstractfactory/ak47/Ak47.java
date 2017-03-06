package io.github.xulingjue.designpatterns.abstractfactory.ak47;

import io.github.xulingjue.designpatterns.abstractfactory.Bullet;
import io.github.xulingjue.designpatterns.abstractfactory.Gun;

/**
 * Ak47
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/6 16:20
 * @Version V1.0
 */
public class Ak47 implements Gun {

    protected Bullet bullet;

    public void loadeBullets(Bullet bullet) {
        this.bullet = bullet;
    }

    public void fire() {
        if (this.bullet != null) {
            System.out.println("Ak47 fire:");
            this.bullet.flying();
            this.bullet = null;
        } else {
            System.out.println("Ak47 has no bullet!");
        }
    }
}
