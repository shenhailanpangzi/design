package com.yanghao.design.desogn.createdMode.AbstractFactoryPattern;

import com.yanghao.design.desogn.createdMode.AbstractFactoryPattern.Color.Color;
import com.yanghao.design.desogn.createdMode.AbstractFactoryPattern.Shape.Shape;

/**
 * @Description：步骤 5
 * 为 Color 和 Shape 对象创建抽象类来获取工厂。
 * @Author:yanghao
 * @Date：2018/7/23 10:02
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}