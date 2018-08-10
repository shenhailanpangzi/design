package com.yanghao.design.desogn.behavioralModel.VisitorPattern.impl;

import com.yanghao.design.desogn.behavioralModel.VisitorPattern.ComputerPart;
import com.yanghao.design.desogn.behavioralModel.VisitorPattern.ComputerPartVisitor;

/**
 * @Description：
 * 步骤 2
 * 创建扩展了上述类的实体类。
 * @Author:yanghao
 * @Date：2018/7/24 15:55
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}