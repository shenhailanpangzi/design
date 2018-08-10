package com.yanghao.design.desogn.createdMode.BuilderPattern;

/**
 * @Description：
 * 步骤 7
 * BuiderPatternDemo 使用 MealBuider 来演示建造者模式（Builder Pattern）。
 * @Author:yanghao
 * @Date：2018/7/23 11:00
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        //创建蔬菜套餐
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        //创建非蔬菜套餐
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}