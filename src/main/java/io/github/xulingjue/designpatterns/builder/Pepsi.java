package io.github.xulingjue.designpatterns.builder;

/**
 * Pepsi
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/8 14:13
 * @Version V1.0
 */
public class Pepsi extends ColdDrink {
    public String name() {
        return "Pepsi";
    }

    public float price() {
        return 35.0f;
    }
}
