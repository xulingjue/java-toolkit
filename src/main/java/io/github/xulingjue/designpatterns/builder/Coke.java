package io.github.xulingjue.designpatterns.builder;

/**
 * Coke
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/8 14:09
 * @Version V1.0
 */
public class Coke extends ColdDrink {
    public String name() {
        return "Coke";
    }

    public float price() {
        return 30.0f;
    }
}
