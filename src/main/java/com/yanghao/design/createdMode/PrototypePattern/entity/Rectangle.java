package com.yanghao.design.createdMode.PrototypePattern.entity;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 11:19
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
