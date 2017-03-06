package io.github.xulingjue.designpatterns.abstractfactory.deserteagle;

import io.github.xulingjue.designpatterns.abstractfactory.Bullet;
import io.github.xulingjue.designpatterns.abstractfactory.Gun;

/**
 * DesertEagle
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/6 16:38
 * @Version V1.0
 */
public class DesertEagle implements Gun{

    private Bullet bullet;

    public void loadeBullets(Bullet bullet) {
        this.bullet = bullet;
    }

    public void fire() {
        if(this.bullet != null){
            System.out.println("DesertEagle fire:"+this.bullet);
            this.bullet = null;
        }

        System.out.println("DesertEagle has no bullet!");
    }
}
