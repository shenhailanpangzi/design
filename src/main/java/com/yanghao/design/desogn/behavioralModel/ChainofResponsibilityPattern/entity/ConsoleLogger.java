package com.yanghao.design.desogn.behavioralModel.ChainofResponsibilityPattern.entity;

import com.yanghao.design.desogn.behavioralModel.ChainofResponsibilityPattern.AbstractLogger;

/**
 * @Description：
 * 步骤 2
 * 创建扩展了该记录器类的实体类。
 * @Author:yanghao
 * @Date：2018/7/23 17:12
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
