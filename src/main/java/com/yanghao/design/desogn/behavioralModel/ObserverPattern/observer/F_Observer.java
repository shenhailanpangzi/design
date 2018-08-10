package com.yanghao.design.desogn.behavioralModel.ObserverPattern.observer;

/**
 * @Description：
 * 第一个观察者：
 * @Author:yanghao
 * @Date：2018/7/24 14:36
 */
public class F_Observer extends Observer {
    @Override
    public void update(String msg) {
        System.out.println(F_Observer.class.getName() + " : " + msg);
    }
}