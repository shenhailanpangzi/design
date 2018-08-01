package com.yanghao.design.createdMode.AbstractFactoryPattern;

import com.yanghao.design.createdMode.AbstractFactoryPattern.Color.Color;
import com.yanghao.design.createdMode.AbstractFactoryPattern.Shape.Circle;
import com.yanghao.design.createdMode.AbstractFactoryPattern.Shape.Rectangle;
import com.yanghao.design.createdMode.AbstractFactoryPattern.Shape.Shape;
import com.yanghao.design.createdMode.AbstractFactoryPattern.Shape.Square;

/**
 * @Description：步骤 6
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 * @Author:yanghao
 * @Date：2018/7/23 10:02
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
