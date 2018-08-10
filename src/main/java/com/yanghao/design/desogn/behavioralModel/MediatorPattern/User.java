package com.yanghao.design.desogn.behavioralModel.MediatorPattern;

/**
 * @Description：
 * 步骤 2
 * 创建 user 类。
 * @Author:yanghao
 * @Date：2018/7/24 14:16
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}