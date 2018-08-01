package com.yanghao.design.structuralMode.FlyweightPattern;

import com.yanghao.design.structuralMode.FlyweightPattern.impl.Circle;

import java.util.HashMap;


/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 16:22
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}