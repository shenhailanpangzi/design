package com.yanghao.design.structuralMode.DecoratorPattern;

import com.yanghao.design.structuralMode.DecoratorPattern.impl.ShapeDecorator;

/**
 * @Description：
 * 步骤 4
 * 创建扩展了 ShapeDecorator 类的实体装饰类。
 * @Author:yanghao
 * @Date：2018/7/23 15:57
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}