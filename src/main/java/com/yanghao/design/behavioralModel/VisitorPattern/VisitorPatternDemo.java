package com.yanghao.design.behavioralModel.VisitorPattern;

import com.yanghao.design.behavioralModel.VisitorPattern.impl.Computer;

/**
 * @Description：
 * 步骤 5
 * 使用 ComputerPartDisplayVisitor 来显示 Computer 的组成部分。
 * @Author:yanghao
 * @Date：2018/7/24 15:56
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}