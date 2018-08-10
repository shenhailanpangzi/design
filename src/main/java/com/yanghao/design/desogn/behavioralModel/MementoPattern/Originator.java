package com.yanghao.design.desogn.behavioralModel.MementoPattern;

import lombok.Data;

/**
 * @Description：初始类
 * 步骤 2
 * 创建 Originator 类。
 * @Author:yanghao
 * @Date：2018/7/24 14:26
 */
@Data
public class Originator {
    private String state;

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}