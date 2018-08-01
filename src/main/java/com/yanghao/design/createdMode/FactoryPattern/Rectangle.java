package com.yanghao.design.createdMode.FactoryPattern;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 9:45
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}