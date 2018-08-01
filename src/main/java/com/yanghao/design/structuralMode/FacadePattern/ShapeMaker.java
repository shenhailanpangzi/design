package com.yanghao.design.structuralMode.FacadePattern;

import com.yanghao.design.structuralMode.FacadePattern.impl.Circle;
import com.yanghao.design.structuralMode.FacadePattern.impl.Rectangle;
import com.yanghao.design.structuralMode.FacadePattern.impl.Square;

/**
 * @Description：
 * .步骤 3
 * 创建一个外观类。
 * @Author:yanghao
 * @Date：2018/7/23 16:17
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
