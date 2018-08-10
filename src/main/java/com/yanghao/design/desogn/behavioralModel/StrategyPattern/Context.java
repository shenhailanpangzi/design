package com.yanghao.design.desogn.behavioralModel.StrategyPattern;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 15:13
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}