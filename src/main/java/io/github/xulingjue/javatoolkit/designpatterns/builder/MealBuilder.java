package io.github.xulingjue.javatoolkit.designpatterns.builder;

/**
 * MealBuilder
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/8 14:27
 * @Version V1.0
 */
public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());

        return meal;
    }
}
