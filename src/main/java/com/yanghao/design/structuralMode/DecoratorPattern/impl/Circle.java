package com.yanghao.design.structuralMode.DecoratorPattern.impl;

import com.yanghao.design.structuralMode.DecoratorPattern.Shape;

/**
 * @Description：
 * 步骤 2
 * 创建实现接口的实体类。
 * @Author:yanghao
 * @Date：2018/7/23 15:52
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}