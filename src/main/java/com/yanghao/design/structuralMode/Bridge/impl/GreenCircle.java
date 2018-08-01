package com.yanghao.design.structuralMode.Bridge.impl;

import com.yanghao.design.structuralMode.Bridge.DrawAPI;

/**
 * @Description：
 * 步骤 2
 * 创建实现了 DrawAPI 接口的实体桥接实现类。
 * @Author:yanghao
 * @Date：2018/7/23 14:34
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: 绿色, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}