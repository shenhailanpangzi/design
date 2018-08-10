package com.yanghao.design.desogn.createdMode.PrototypePattern.entity;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 11:24
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}