package com.yanghao.design.desogn.createdMode.BuilderPattern.entity;

import com.yanghao.design.desogn.createdMode.BuilderPattern.itemImpl.ColdDrink;

/**
 * @Description：
 * 步骤 4
 * 创建扩展了 Burger 和 ColdDrink 的实体类。
 * @Author:yanghao
 * @Date：2018/7/23 10:55
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "可乐Coke";
    }
}