package com.yanghao.design.behavioralModel.StrategyPattern.impl;

import com.yanghao.design.behavioralModel.StrategyPattern.Strategy;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 15:13
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}