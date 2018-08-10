package com.yanghao.design.desogn.structuralMode.DecoratorPattern.impl;

import com.yanghao.design.desogn.structuralMode.DecoratorPattern.Shape;

/**
 * @Description：
 * 步骤 3
 * 创建实现了 Shape 接口的抽象装饰类。
 * @Author:yanghao
 * @Date：2018/7/23 15:55
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;//装饰形状

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}