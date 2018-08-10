package com.yanghao.design.desogn.createdMode.AbstractFactoryPattern.Color;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 10:00
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}