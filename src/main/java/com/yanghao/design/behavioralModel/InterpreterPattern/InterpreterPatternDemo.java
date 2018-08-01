package com.yanghao.design.behavioralModel.InterpreterPattern;

import com.yanghao.design.behavioralModel.InterpreterPattern.impl.AndExpression;
import com.yanghao.design.behavioralModel.InterpreterPattern.impl.OrExpression;
import com.yanghao.design.behavioralModel.InterpreterPattern.impl.TerminalExpression;

/**
 * @Description：
 * 步骤 3
 * InterpreterPatternDemo 使用 Expression 类来创建规则，并解析它们。
 * @Author:yanghao
 * @Date：2018/7/24 10:58
 */
public class InterpreterPatternDemo {

    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("a"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}