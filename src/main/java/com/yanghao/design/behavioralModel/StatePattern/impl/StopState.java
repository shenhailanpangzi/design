package com.yanghao.design.behavioralModel.StatePattern.impl;

import com.yanghao.design.behavioralModel.StatePattern.Context;
import com.yanghao.design.behavioralModel.StatePattern.State;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 14:46
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
