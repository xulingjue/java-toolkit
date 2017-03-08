package io.github.xulingjue.javatoolkit.designpatterns.builder;

/**
 * Item
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/8 14:01
 * @Version V1.0
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
