package com.yanghao.design.behavioralModel.VisitorPattern.impl;

import com.yanghao.design.behavioralModel.VisitorPattern.ComputerPart;
import com.yanghao.design.behavioralModel.VisitorPattern.ComputerPartVisitor;

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