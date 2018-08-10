package com.yanghao.design.desogn.behavioralModel.VisitorPattern;

import com.yanghao.design.desogn.behavioralModel.VisitorPattern.impl.Computer;
import com.yanghao.design.desogn.behavioralModel.VisitorPattern.impl.Keyboard;
import com.yanghao.design.desogn.behavioralModel.VisitorPattern.impl.Monitor;
import com.yanghao.design.desogn.behavioralModel.VisitorPattern.impl.Mouse;

/**
 * @Description：
 * 步骤 4
 * 创建实现了上述类的实体访问者。
 * @Author:yanghao
 * @Date：2018/7/24 15:55
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}