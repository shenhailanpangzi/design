package com.yanghao.design.desogn.behavioralModel.InterpreterPattern.impl;

import com.yanghao.design.desogn.behavioralModel.InterpreterPattern.Expression;

/**
 * @Description：
 * 步骤 2
 * 创建实现了上述接口的实体类。
 * @Author:yanghao
 * @Date：2018/7/24 10:57
 */
public class OrExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    //或表达
    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}