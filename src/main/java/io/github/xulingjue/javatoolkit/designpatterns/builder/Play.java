package io.github.xulingjue.javatoolkit.designpatterns.builder;

/**
 * Play
 *
 * @author lingjue.xu
 * @Description:
 * @date 2017/3/8 14:29
 * @Version V1.0
 *
 * 建造者模式
 *
 * 关注对象构建本身，屏蔽了复杂的建造过程，与抽象工厂相比，返回的是一个完整的产品（对象），而抽象工厂返回的是一系列相关的产品簇。
 *
 * 本实例值得参考的还有对菜单对象的抽象，将汉堡/饮料通过Item类抽象成了价格和包装两个属性。
 *
 */
public class Play {

    public static void main(String [] agrs){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\\n\\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
