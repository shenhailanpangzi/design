package com.yanghao.design.desogn.structuralMode.FacadePattern.impl;

import com.yanghao.design.desogn.structuralMode.FacadePattern.Shape;

/**
 * @Description：
 * 步骤 2
 * 创建实现接口的实体类。
 * @Author:yanghao
 * @Date：2018/7/23 16:15
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
