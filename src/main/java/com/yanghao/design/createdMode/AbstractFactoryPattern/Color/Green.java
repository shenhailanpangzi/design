package com.yanghao.design.createdMode.AbstractFactoryPattern.Color;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 10:00
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}