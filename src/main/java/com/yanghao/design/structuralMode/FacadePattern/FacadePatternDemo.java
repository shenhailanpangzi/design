package com.yanghao.design.structuralMode.FacadePattern;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 16:18
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}