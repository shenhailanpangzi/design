package com.yanghao.design.createdMode.BuilderPattern;

import com.yanghao.design.createdMode.BuilderPattern.entity.ChickenBurger;
import com.yanghao.design.createdMode.BuilderPattern.entity.Coke;
import com.yanghao.design.createdMode.BuilderPattern.entity.Pepsi;
import com.yanghao.design.createdMode.BuilderPattern.entity.VegBurger;

/**
 * @Description：
 * 步骤 6
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 * @Author:yanghao
 * @Date：2018/7/23 10:59
 */
public class MealBuilder {
//准备蔬菜餐
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
//准备非蔬菜餐
    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}