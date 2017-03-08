package io.github.xulingjue.javatoolkit.designpatterns.abstractfactory;

/**
 * Play
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/6 16:50
 * @Version V1.0
 *
 * 抽象工厂示例：
 *
 * 抽象工厂是对一组有关联产品的打包生产，对用户隐藏了生产和关联的细节，
 * 如该实例中，用户不需要指明要购买Ak47的子弹，只要知道和枪同一个工厂生产的子弹就可以了。
 *
 */
public class Play {
    public static void main(String[] agrs) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("Ak47");

        Gun gun = abstractFactory.getGun();

        for (int i = 0; i < 3; i++) {
            gun.loadeBullets(abstractFactory.getBullet());
            gun.fire();
        }

        gun.fire();
    }
}
