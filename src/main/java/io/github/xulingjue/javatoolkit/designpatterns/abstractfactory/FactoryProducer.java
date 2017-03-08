package io.github.xulingjue.javatoolkit.designpatterns.abstractfactory;

import io.github.xulingjue.javatoolkit.designpatterns.abstractfactory.ak47.Ak47Factory;
import io.github.xulingjue.javatoolkit.designpatterns.abstractfactory.deserteagle.DesetEagleFactory;

/**
 * FactoryProducer
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/6 16:34
 * @Version V1.0
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if ("Ak47".equals(choice)) {
            return new Ak47Factory();
        }
        return new DesetEagleFactory();
    }
}
