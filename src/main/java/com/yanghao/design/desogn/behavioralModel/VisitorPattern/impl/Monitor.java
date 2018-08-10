package com.yanghao.design.desogn.behavioralModel.VisitorPattern.impl;

import com.yanghao.design.desogn.behavioralModel.VisitorPattern.ComputerPart;
import com.yanghao.design.desogn.behavioralModel.VisitorPattern.ComputerPartVisitor;

/**
 * @Description：
 * 步骤 2
 * 创建扩展了上述类的实体类。
 * @Author:yanghao
 * @Date：2018/7/24 15:54
 */
public class Monitor  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}