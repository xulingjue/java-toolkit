package io.github.xulingjue.designpatterns.builder;

/**
 * VegBurger
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/8 14:07
 * @Version V1.0
 */
public class VegBurger extends Burger {
    public String name() {
        return "Veg Burger";
    }

    public float price() {
        return 25.0f;
    }
}
