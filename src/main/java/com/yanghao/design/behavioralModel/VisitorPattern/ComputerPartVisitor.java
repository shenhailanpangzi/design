package com.yanghao.design.behavioralModel.VisitorPattern;

import com.yanghao.design.behavioralModel.VisitorPattern.impl.Computer;
import com.yanghao.design.behavioralModel.VisitorPattern.impl.Keyboard;
import com.yanghao.design.behavioralModel.VisitorPattern.impl.Monitor;
import com.yanghao.design.behavioralModel.VisitorPattern.impl.Mouse;

/**
 * @Description：
 * 步骤 3
 * 定义一个表示访问者的接口。
 * @Author:yanghao
 * @Date：2018/7/24 15:55
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}