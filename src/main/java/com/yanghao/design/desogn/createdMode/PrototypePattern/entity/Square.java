package com.yanghao.design.desogn.createdMode.PrototypePattern.entity;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 11:23
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}