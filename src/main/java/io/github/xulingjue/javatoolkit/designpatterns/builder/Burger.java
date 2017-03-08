package io.github.xulingjue.javatoolkit.designpatterns.builder;

/**
 * Burger
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/8 14:04
 * @Version V1.0
 */
public abstract class Burger implements Item{
    public Packing packing(){
        return new Wrapper();
    }

    public abstract float price();
}
