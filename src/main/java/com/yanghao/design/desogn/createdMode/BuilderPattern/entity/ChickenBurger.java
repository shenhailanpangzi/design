package com.yanghao.design.desogn.createdMode.BuilderPattern.entity;

import com.yanghao.design.desogn.createdMode.BuilderPattern.itemImpl.Burger;

/**
 * @Description：
 *  * 步骤 4
 *  * 创建扩展了 Burger 和 ColdDrink 的实体类。
 * @Author:yanghao
 * @Date：2018/7/23 10:54
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}