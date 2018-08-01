package com.yanghao.design.createdMode.PrototypePattern;

import com.yanghao.design.createdMode.PrototypePattern.entity.Shape;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 11:31
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());


        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}