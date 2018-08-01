package com.yanghao.design.structuralMode.ProxyPattern.impl;

import com.yanghao.design.structuralMode.ProxyPattern.Image;

/**
 * @Description：真实的形象
 * 步骤 2
 * 创建实现接口的实体类。
 * @Author:yanghao
 * @Date：2018/7/23 16:34
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}