package com.yanghao.design.desogn.structuralMode.DecoratorPattern;

import com.yanghao.design.desogn.structuralMode.DecoratorPattern.impl.Circle;
import com.yanghao.design.desogn.structuralMode.DecoratorPattern.impl.Rectangle;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 15:58
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}