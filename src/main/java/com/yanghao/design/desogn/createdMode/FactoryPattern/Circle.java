package com.yanghao.design.desogn.createdMode.FactoryPattern;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 9:46
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
