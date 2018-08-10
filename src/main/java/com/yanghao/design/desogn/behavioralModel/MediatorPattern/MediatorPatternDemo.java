package com.yanghao.design.desogn.behavioralModel.MediatorPattern;

/**
 * @Description：中介者模式
 * @Author:yanghao
 * @Date：2018/7/24 14:17
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}