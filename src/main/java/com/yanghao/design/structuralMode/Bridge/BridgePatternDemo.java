package com.yanghao.design.structuralMode.Bridge;

import com.yanghao.design.structuralMode.Bridge.impl.GreenCircle;
import com.yanghao.design.structuralMode.Bridge.impl.RedCircle;

/**
 * @Description：
 * 步骤 5
 * 使用 Shape 和 DrawAPI 类画出不同颜色的圆。
 * @Author:yanghao
 * @Date：2018/7/23 14:39
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}