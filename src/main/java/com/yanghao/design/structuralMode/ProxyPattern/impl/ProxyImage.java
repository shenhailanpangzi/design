package com.yanghao.design.structuralMode.ProxyPattern.impl;

import com.yanghao.design.structuralMode.ProxyPattern.Image;

/**
 * @Description：代理图像
 * 步骤 2
 * 创建实现接口的实体类。
 * @Author:yanghao
 * @Date：2018/7/23 16:35
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}