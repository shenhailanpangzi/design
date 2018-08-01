package com.yanghao.design.behavioralModel.InterpreterPattern.impl;

import com.yanghao.design.behavioralModel.InterpreterPattern.Expression;

/**
 * @Description：
 * 步骤 2
 * 创建实现了上述接口的实体类。
 * @Author:yanghao
 * @Date：2018/7/24 10:57
 */
public class AndExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    //和表达
    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}