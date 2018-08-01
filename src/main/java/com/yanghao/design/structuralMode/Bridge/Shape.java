package com.yanghao.design.structuralMode.Bridge;

/**
 * @Description：
 * 步骤 3
 * 使用 DrawAPI 接口创建抽象类 Shape。
 * @Author:yanghao
 * @Date：2018/7/23 14:35
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}