package com.yanghao.design.desogn.behavioralModel.ChainofResponsibilityPattern.entity;

import com.yanghao.design.desogn.behavioralModel.ChainofResponsibilityPattern.AbstractLogger;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/23 17:24
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}