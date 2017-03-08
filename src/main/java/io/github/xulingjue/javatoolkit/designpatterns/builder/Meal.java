package io.github.xulingjue.javatoolkit.designpatterns.builder;

import java.util.List;
import java.util.ArrayList;

/**
 * Meal
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/8 14:19
 * @Version V1.0
 */
public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }

}
