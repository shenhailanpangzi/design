package com.yanghao.design.desogn.behavioralModel.VisitorPattern.impl;

import com.yanghao.design.desogn.behavioralModel.VisitorPattern.ComputerPart;
import com.yanghao.design.desogn.behavioralModel.VisitorPattern.ComputerPartVisitor;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 15:54
 */
public class Mouse  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}