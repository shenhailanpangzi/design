package com.yanghao.design.createdMode.AbstractFactoryPattern;

import com.yanghao.design.createdMode.AbstractFactoryPattern.Color.Blue;
import com.yanghao.design.createdMode.AbstractFactoryPattern.Color.Color;
import com.yanghao.design.createdMode.AbstractFactoryPattern.Color.Green;
import com.yanghao.design.createdMode.AbstractFactoryPattern.Color.Red;
import com.yanghao.design.createdMode.AbstractFactoryPattern.Shape.Shape;

/**
 * @Description：步骤 6
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象
 * @Author:yanghao
 * @Date：2018/7/23 10:03
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}