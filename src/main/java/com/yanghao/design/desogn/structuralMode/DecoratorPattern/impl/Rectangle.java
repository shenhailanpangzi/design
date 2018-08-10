package com.yanghao.design.desogn.structuralMode.DecoratorPattern.impl;

import com.yanghao.design.desogn.structuralMode.DecoratorPattern.Shape;

/**
 * @Description：
 * 步骤 2
 * 创建实现接口的实体类。
 * @Author:yanghao
 * @Date：2018/7/23 15:51
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle(长方形)");
    }
}