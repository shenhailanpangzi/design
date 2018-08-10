package com.yanghao.design.desogn.behavioralModel.ChainofResponsibilityPattern.entity;

import com.yanghao.design.desogn.behavioralModel.ChainofResponsibilityPattern.AbstractLogger;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 17:24
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}