package com.yanghao.design.createdMode.FactoryPattern;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 9:45
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}