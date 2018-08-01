package com.yanghao.design.behavioralModel.InterpreterPattern;

/**
 * @Description：
 * 步骤 1
 * 创建一个表达式接口。
 * @Author:yanghao
 * @Date：2018/7/24 10:55
 */
public interface Expression {
    public boolean interpret(String context);
}