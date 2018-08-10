package com.yanghao.design.desogn.behavioralModel.InterpreterPattern.impl;

import com.yanghao.design.desogn.behavioralModel.InterpreterPattern.Expression;

/**
 * @Description：
 * 步骤 2
 * 创建实现了上述接口的实体类。
 * @Author:yanghao
 * @Date：2018/7/24 10:55
 */
public class TerminalExpression implements Expression {

    private String data;
    //终端表达
    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}