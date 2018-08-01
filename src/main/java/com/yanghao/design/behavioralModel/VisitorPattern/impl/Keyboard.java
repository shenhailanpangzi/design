package com.yanghao.design.behavioralModel.VisitorPattern.impl;

import com.yanghao.design.behavioralModel.VisitorPattern.ComputerPart;
import com.yanghao.design.behavioralModel.VisitorPattern.ComputerPartVisitor;

/**
 * @Description：
 * 步骤 2
 * 创建扩展了上述类的实体类。
 * @Author:yanghao
 * @Date：2018/7/24 15:53
 */
public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}