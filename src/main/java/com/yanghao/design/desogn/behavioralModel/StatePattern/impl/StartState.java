package com.yanghao.design.desogn.behavioralModel.StatePattern.impl;

import com.yanghao.design.desogn.behavioralModel.StatePattern.Context;
import com.yanghao.design.desogn.behavioralModel.StatePattern.State;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 14:46
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Start State";
    }
}