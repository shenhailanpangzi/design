package com.yanghao.design.desogn.behavioralModel.ObserverPattern.observer;

/**
 * @Description：
 * 第二个观察者：
 * @Author:yanghao
 * @Date：2018/7/24 14:37
 */
public class S_Observer extends Observer {
    @Override
    public void update(String msg) {
        System.out.println(S_Observer.class.getName() + " : " + msg);
    }
}