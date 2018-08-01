package com.yanghao.design.createdMode.BuilderPattern.entity;

import com.yanghao.design.createdMode.BuilderPattern.itemImpl.Burger;

/**
 * @Description：蔬菜汉堡
 * 步骤 4
 * 创建扩展了 Burger 和 ColdDrink 的实体类。
 * @Author:yanghao
 * @Date：2018/7/23 10:53
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}