package com.yanghao.design.behavioralModel.StrategyPattern;

import com.yanghao.design.behavioralModel.StrategyPattern.impl.OperationAdd;
import com.yanghao.design.behavioralModel.StrategyPattern.impl.OperationMultiply;
import com.yanghao.design.behavioralModel.StrategyPattern.impl.OperationSubstract;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 15:13
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}