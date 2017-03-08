package io.github.xulingjue.javatoolkit.designpatterns.builder;

/**
 * ChickenBurger
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/8 14:08
 * @Version V1.0
 */
public class ChickenBurger extends Burger {
    public String name() {
        return "Chicken Burger";
    }

    public float price() {
        return 50.5f;
    }
}
