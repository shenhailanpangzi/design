package com.yanghao.design.desogn.behavioralModel.StrategyPattern.impl;

import com.yanghao.design.desogn.behavioralModel.StrategyPattern.Strategy;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 15:12
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}