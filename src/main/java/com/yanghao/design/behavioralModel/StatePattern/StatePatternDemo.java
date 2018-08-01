package com.yanghao.design.behavioralModel.StatePattern;

import com.yanghao.design.behavioralModel.StatePattern.impl.StartState;
import com.yanghao.design.behavioralModel.StatePattern.impl.StopState;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 14:47
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
