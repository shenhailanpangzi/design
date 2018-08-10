package com.yanghao.design.desogn.behavioralModel.MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description：管理员
 * 步骤 3
 * 创建 CareTaker 类。
 * @Author:yanghao
 * @Date：2018/7/24 14:27
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}