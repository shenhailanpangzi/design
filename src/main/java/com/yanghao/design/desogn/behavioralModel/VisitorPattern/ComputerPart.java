package com.yanghao.design.desogn.behavioralModel.VisitorPattern;

/**
 * @Description：电脑部分
 * 步骤 1
 * 定义一个表示元素的接口。
 * @Author:yanghao
 * @Date：2018/7/24 15:53
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}