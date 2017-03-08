package io.github.xulingjue.designpatterns.builder;

/**
 * ColdDrink
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/8 14:06
 * @Version V1.0
 */
public abstract class ColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
