package com.yanghao.design.behavioralModel.StrategyPattern.impl;

import com.yanghao.design.behavioralModel.StrategyPattern.Strategy;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 15:12
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}